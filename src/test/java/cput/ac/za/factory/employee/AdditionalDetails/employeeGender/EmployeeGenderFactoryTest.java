package cput.ac.za.factory.employee.AdditionalDetails.employeeGender;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    private EmployeeGender employeeGender;

    @Before
    public void setUp(){
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", 1);
    }

    @Test
    public void buildEmployeeGender() {
        assertNotNull(employeeGender);
        System.out.println("Employee Gender Factory : " + employeeGender);
    }
}