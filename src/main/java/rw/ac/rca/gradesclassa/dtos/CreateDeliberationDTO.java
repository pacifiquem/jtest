package rw.ac.rca.gradesclassa.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.models.Student;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateDeliberationDTO {

    private UUID studentId;

    private String academicYear;

    private Double totalScore;

    private Double totalPassMark;

    private Double totalOutOf;

    private Integer position;

    @Enumerated (EnumType.STRING)
    private EDecision decision;
}
