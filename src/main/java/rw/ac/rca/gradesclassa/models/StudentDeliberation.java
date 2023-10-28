package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.*;
import rw.ac.rca.gradesclassa.enumerations.EDecision;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Setter
@Getter
public class StudentDeliberation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Student student;

    private String academicYear;

    private Double totalScore;

    private Double totalPassMark;

    private Double totalOutOf;

    private Integer position;

    @Enumerated(EnumType.STRING)
    private EDecision decision;

    private LocalDate date;
}
