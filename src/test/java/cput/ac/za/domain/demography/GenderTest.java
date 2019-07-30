package cput.ac.za.domain.demography;

import cput.ac.za.factory.demography.GenderFactory;
import cput.ac.za.repository.demography.GenderRepository;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class GenderTest {

    private GenderRepository genderRepository;
    private Gender gender;
    @Before
    public void setUp() throws Exception {
    genderRepository = GenderRepository.getRepository();

    gender = GenderFactory.buildGender("216062241", "Male");
    }

    @Test
    public void getEmpNumber() {
        assertNotNull(gender.getEmpNumber());
        System.out.println(gender.getEmpNumber());
    }

    @Test
    public void getGender() {
        assertNotNull(gender.getGender());
        System.out.println(gender.getGender());
    }
}