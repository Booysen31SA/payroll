package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    EmployeeGender employeeGender;
    @Before
    public void setUp() {
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", "Male");
    }

    @Test
    public void buildGender() {
        assertNotNull(employeeGender);
        System.out.println(employeeGender);
    }
}