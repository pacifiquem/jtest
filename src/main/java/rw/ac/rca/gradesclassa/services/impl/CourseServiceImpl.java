package rw.ac.rca.gradesclassa.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassa.dtos.CreateCourseDTO;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.services.ICourseService;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements ICourseService {
    @Override
    public Course save(CreateCourseDTO dto) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Course update(UUID id, CreateCourseDTO dto) {
        return null;
    }

    @Override
    public Course getById(UUID id) {
        return null;
    }

    @Override
    public Course getByCode(String code) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public List<Course> getAllByStatus(EStatus status) {
        return null;
    }
}
