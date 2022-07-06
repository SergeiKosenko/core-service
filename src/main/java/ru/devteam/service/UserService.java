package ru.devteam.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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
}
