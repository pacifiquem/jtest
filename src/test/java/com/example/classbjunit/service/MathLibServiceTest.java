package com.example.classbjunit.service;

import com.example.classbjunit.model.MathLib;
import com.example.classbjunit.repository.MathLibRepository;
import com.example.classbjunit.service.MathLibServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testng.Assert;

import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
public class MathLibServiceTest {

    @Mock
    MathLibRepository mathLibRepository;
    @InjectMocks
    private MathLibServiceImpl mathLibService;

    @Test void save_mathLib(){
        MathLib mathLib = new MathLib(1, 2);
        mathLib.setSum(3);
        mathLib.setProduct(2);
        MathLib mathLib1 = new MathLib(1,2);

        when(mathLibRepository.save(mathLib1)).thenReturn(mathLib);
        Assert.assertEquals(mathLib,mathLibRepository.save(mathLib1));
    }
}