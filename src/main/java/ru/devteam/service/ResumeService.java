package ru.devteam.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.entities.Resume;
import ru.devteam.repository.ResumeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public List<Resume> findAll(){
        return resumeRepository.findAll();

    }
}
