package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender("216062241", "Male");
    }

    @Test
    public void buildGender() {
        assertNotNull(gender);
        System.out.println(gender);
    }
}