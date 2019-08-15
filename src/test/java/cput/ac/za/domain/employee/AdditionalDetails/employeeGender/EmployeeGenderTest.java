package cput.ac.za.domain.employee.AdditionalDetails.employeeGender;

import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import cput.ac.za.repository.employee.AdditionalDetails.employeeGender.impl.EmployeeGenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderTest {

    EmployeeGenderRepositoryImpl repository;
    EmployeeGender employeeGender;

    @Before
    public void setUp(){
        repository = EmployeeGenderRepositoryImpl.getRepository();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", 1);
    }

    @Test
    public void getEmpID() {
        assertNotNull(employeeGender.getEmpID());
        System.out.println("Employee Gender : "+employeeGender.getEmpID());
    }

    @Test
    public void getCode() {
        assertNotNull(employeeGender.getCode());
        System.out.println("Employee Code : "+employeeGender.getCode());
    }
}