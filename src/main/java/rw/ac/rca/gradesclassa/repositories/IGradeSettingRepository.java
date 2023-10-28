package rw.ac.rca.gradesclassa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.gradesclassa.models.GradeSetting;

import java.util.UUID;

@Repository
public interface IGradeSettingRepository extends JpaRepository<GradeSetting, UUID> {
}
