package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateCourseDTO;
import rw.ac.rca.gradesclassa.dtos.CreateDeliberationDTO;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.Student;
import rw.ac.rca.gradesclassa.models.StudentDeliberation;

import java.util.List;
import java.util.UUID;

public interface IStudentDeliberationService {

    StudentDeliberation save(CreateDeliberationDTO dto);
    boolean delete(UUID id);
    StudentDeliberation update(UUID id, CreateDeliberationDTO dto);
    StudentDeliberation getById(UUID id);
    StudentDeliberation getByStudentAndAcademicYear(Student student, String academicYear);
    List<StudentDeliberation> getAllByStudent(Student student);
    List<StudentDeliberation> getAllByAcademicYear(String academicYear);
    List<StudentDeliberation> getAllByAcademicYearAndDecision(String academicYear, EDecision decision);
}
