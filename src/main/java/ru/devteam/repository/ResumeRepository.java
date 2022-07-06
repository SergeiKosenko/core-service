package ru.devteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.entities.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
