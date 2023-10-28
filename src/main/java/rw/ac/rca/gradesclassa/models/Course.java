package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.*;
import rw.ac.rca.gradesclassa.enumerations.EGender;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

import java.util.UUID;

@Entity
@Setter
@Getter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Double passMark;//70

    private Double outOf;//100

    @Enumerated(EnumType.STRING)
    private EStatus status;

    @Column(unique = true)
    private String code;
}
