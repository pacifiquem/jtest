package rw.ac.rca.gradesclassa.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseDTO {

    private String name;

    private Double passMark;//70

    private Double outOf;//100

    @Column (unique = true)
    private String code;
}
