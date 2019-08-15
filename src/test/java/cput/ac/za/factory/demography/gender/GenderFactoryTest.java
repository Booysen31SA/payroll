package cput.ac.za.factory.demography.gender;

import cput.ac.za.domain.demography.gender.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    private Gender gender;
    @Before
    public void setUp(){
        gender = GenderFactory.buildGender(1, "Male");
    }

    @Test
    public void buildGender() {
        assertNotNull(gender);
        System.out.println("Gender Factory :" +gender);
    }
}