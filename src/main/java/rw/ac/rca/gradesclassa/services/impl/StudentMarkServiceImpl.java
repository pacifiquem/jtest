package rw.ac.rca.gradesclassa.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassa.dtos.CreateStudentCourseMarkDTO;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.Student;
import rw.ac.rca.gradesclassa.models.StudentCourseMark;
import rw.ac.rca.gradesclassa.services.IStudentMarkService;

import java.util.List;
import java.util.UUID;

@Service
public class StudentMarkServiceImpl implements IStudentMarkService {
    @Override
    public StudentCourseMark save(CreateStudentCourseMarkDTO dto) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public StudentCourseMark update(UUID id, CreateStudentCourseMarkDTO dto) {
        return null;
    }

    @Override
    public StudentCourseMark getById(UUID id) {
        return null;
    }

    @Override
    public StudentCourseMark getByCourseAndStudent(UUID course, UUID student, String academicYear) {
        return null;
    }

    @Override
    public StudentCourseMark getByCourseAndStudent(Course course, Student student, String academicYear) {
        return null;
    }

    @Override
    public List<StudentCourseMark> getAllByCourseAndStudent(Course course, Student student) {
        return null;
    }

    @Override
    public List<StudentCourseMark> getAllByCourseAndDecision(Course course, EDecision decision) {
        return null;
    }
}
