package ru.devteam.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.dto.CreateNewUsersDto;
import ru.devteam.entities.User;
import ru.devteam.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();

    }

    public void createNewUser(CreateNewUsersDto createNewUsersDto) {
        User user = new User();
        user.setPhoto(createNewUsersDto.getPhoto());
        user.setUserfirstname(createNewUsersDto.getUserfirstname());
        user.setUserlastname(createNewUsersDto.getUserlastname());
        user.setGender(createNewUsersDto.getGender());
        user.setEmail(createNewUsersDto.getEmail());
        user.setPassword(createNewUsersDto.getPassword());
    }
}
