package ru.devteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.entities.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}
