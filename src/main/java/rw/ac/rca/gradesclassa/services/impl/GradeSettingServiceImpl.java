package rw.ac.rca.gradesclassa.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassa.dtos.CreateGradeSettingDTO;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.GradeSetting;
import rw.ac.rca.gradesclassa.services.IGradeSettingService;

import java.util.List;
import java.util.UUID;

@Service
public class GradeSettingServiceImpl implements IGradeSettingService {
    @Override
    public GradeSetting save(CreateGradeSettingDTO dto) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public GradeSetting update(UUID id, CreateGradeSettingDTO dto) {
        return null;
    }

    @Override
    public GradeSetting getById(UUID id) {
        return null;
    }

    @Override
    public GradeSetting getByCourse(UUID course) {
        return null;
    }

    @Override
    public GradeSetting getByCourse(Course course) {
        return null;
    }

    @Override
    public List<GradeSetting> getAll() {
        return null;
    }
}
