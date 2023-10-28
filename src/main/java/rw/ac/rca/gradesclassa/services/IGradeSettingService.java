package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateCourseDTO;
import rw.ac.rca.gradesclassa.dtos.CreateGradeSettingDTO;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.GradeSetting;

import java.util.List;
import java.util.UUID;

public interface IGradeSettingService {

    GradeSetting save(CreateGradeSettingDTO dto);
    boolean delete(UUID id);
    GradeSetting update(UUID id, CreateGradeSettingDTO dto);
    GradeSetting getById(UUID id);
    GradeSetting getByCourse(UUID course);
    GradeSetting getByCourse(Course course);
    List<GradeSetting> getAll();
}
