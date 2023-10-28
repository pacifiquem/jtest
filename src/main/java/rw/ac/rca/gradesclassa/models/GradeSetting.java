package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.*;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

import java.util.UUID;

@Entity
@Setter
@Getter
public class GradeSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Double minScore;

    private Double maxScore;

    private String grade;

}
