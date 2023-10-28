package rw.ac.rca.gradesclassa.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.rca.gradesclassa.enumerations.EGender;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentDTO {

    private String firstName;

    private String lastName;

    @Enumerated (EnumType.STRING)
    private EGender gender;

    @Override
    public String toString() {
        return "{" +
                "firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", gender:" + gender +
                '}';
    }
}
