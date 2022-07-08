package ru.devteam.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.devteam.dto.CreateNewUsersDto;
import ru.devteam.entities.User;
import ru.devteam.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateNewUsers(@RequestBody CreateNewUsersDto createNewUsersDto) {
        userService.createNewUser(createNewUsersDto);
    }

}
