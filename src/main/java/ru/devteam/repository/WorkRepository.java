package ru.devteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.entities.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
}
