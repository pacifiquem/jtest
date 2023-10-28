package rw.ac.rca.gradesclassa.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassa.dtos.CreateDeliberationDTO;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.models.Student;
import rw.ac.rca.gradesclassa.models.StudentDeliberation;
import rw.ac.rca.gradesclassa.services.IStudentDeliberationService;

import java.util.List;
import java.util.UUID;

@Service
public class StudentDeliberationServiceImpl implements IStudentDeliberationService {
    @Override
    public StudentDeliberation save(CreateDeliberationDTO dto) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public StudentDeliberation update(UUID id, CreateDeliberationDTO dto) {
        return null;
    }

    @Override
    public StudentDeliberation getById(UUID id) {
        return null;
    }

    @Override
    public StudentDeliberation getByStudentAndAcademicYear(Student student, String academicYear) {
        return null;
    }

    @Override
    public List<StudentDeliberation> getAllByStudent(Student student) {
        return null;
    }

    @Override
    public List<StudentDeliberation> getAllByAcademicYear(String academicYear) {
        return null;
    }

    @Override
    public List<StudentDeliberation> getAllByAcademicYearAndDecision(String academicYear, EDecision decision) {
        return null;
    }
}
