package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.*;
import rw.ac.rca.gradesclassa.enumerations.EGender;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

import java.util.UUID;

@Entity
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstName;

    private String lastName;

    @Enumerated (EnumType.STRING)
    private EGender gender;

    @Enumerated(EnumType.STRING)
    private EStatus status;

    @Column(unique = true)
    private String registrationCode;
}
