package com.example.classbjunit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.classbjunit.model.MathLib;
@Repository
public interface MathLibRepository extends JpaRepository<MathLib, Integer>{

}