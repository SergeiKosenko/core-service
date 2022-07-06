package ru.devteam.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.entities.Work;
import ru.devteam.repository.WorkRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkService {
    private final WorkRepository workRepository;

    public List<Work> findAll(){
        return workRepository.findAll();

    }
}
