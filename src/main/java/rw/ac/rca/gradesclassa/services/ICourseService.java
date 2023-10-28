package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateCourseDTO;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Course;

import java.util.List;
import java.util.UUID;

public interface ICourseService {

    Course save(CreateCourseDTO dto);
    boolean delete(UUID id);
    Course update(UUID id, CreateCourseDTO dto);
    Course getById(UUID id);
    Course getByCode(String code);
    List<Course> getAll();
    List<Course> getAllByStatus(EStatus status);
}
