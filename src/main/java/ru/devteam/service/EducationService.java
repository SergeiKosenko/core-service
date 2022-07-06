package ru.devteam.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.entities.Education;
import ru.devteam.entities.User;
import ru.devteam.repository.EducationRepository;
import ru.devteam.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository educationRepository;

    public List<Education> findAll(){
        return educationRepository.findAll();

    }
}
