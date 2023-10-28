package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateStudentDTO;
import rw.ac.rca.gradesclassa.enumerations.EGender;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentService {

    Student save(CreateStudentDTO dto);
    boolean delete(UUID id);
    Student update(UUID id, CreateStudentDTO dto);
    Student getById(UUID id);
    Student getByRegistrationCode(String registrationCode);
    List<Student> getAll();
    List<Student> getAllByStatus(EStatus status);
    List<Student> getAllByGender(EGender status);
}
