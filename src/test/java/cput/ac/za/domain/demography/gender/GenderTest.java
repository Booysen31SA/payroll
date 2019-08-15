package cput.ac.za.domain.demography.gender;

import cput.ac.za.factory.demography.gender.GenderFactory;
import cput.ac.za.repository.demography.gender.impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    GenderRepositoryImpl repository;
    Gender gender;
    @Before
    public void setUp(){
       repository = GenderRepositoryImpl.getRepository();
       gender = GenderFactory.buildGender(1, "Male");
    }

    @Test
    public void getCode() {
        assertNotNull(gender.getCode());
        System.out.println("Gender Code : " +gender.getCode());
    }

    @Test
    public void getGenderType() {
        assertNotNull(gender.getGenderType());
        System.out.println("Gender Type : " +gender.getGenderType());
    }
}