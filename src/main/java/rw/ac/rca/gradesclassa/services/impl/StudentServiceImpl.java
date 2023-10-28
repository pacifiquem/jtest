package rw.ac.rca.gradesclassa.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassa.dtos.CreateStudentDTO;
import rw.ac.rca.gradesclassa.enumerations.EGender;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Student;
import rw.ac.rca.gradesclassa.services.IStudentService;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements IStudentService {
    @Override
    public Student save(CreateStudentDTO dto) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Student update(UUID id, CreateStudentDTO dto) {
        return null;
    }

    @Override
    public Student getById(UUID id) {
        return null;
    }

    @Override
    public Student getByRegistrationCode(String registrationCode) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public List<Student> getAllByStatus(EStatus status) {
        return null;
    }

    @Override
    public List<Student> getAllByGender(EGender status) {
        return null;
    }
}
