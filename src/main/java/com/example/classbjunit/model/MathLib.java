package com.example.classbjunit.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class MathLib {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer number1;

    private Integer number2;
    @Transient
    private Integer sum;

    @Transient
    private Integer product;

    public MathLib(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}