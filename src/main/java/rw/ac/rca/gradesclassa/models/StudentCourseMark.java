package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.*;
import rw.ac.rca.gradesclassa.enumerations.EDecision;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Setter
@Getter
public class StudentCourseMark {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    private Double score;//65

    private Double passMark;//60

    private Double outOf;//100

    @Enumerated(EnumType.STRING)
    private EDecision decision;
    private String academicYear;
    private LocalDate date;
}
