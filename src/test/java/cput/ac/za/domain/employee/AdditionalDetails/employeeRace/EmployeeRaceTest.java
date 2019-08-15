package cput.ac.za.domain.employee.AdditionalDetails.employeeRace;

import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import cput.ac.za.factory.employee.AdditionalDetails.employeeRace.EmployeeRaceFactory;
import cput.ac.za.repository.employee.AdditionalDetails.employeeRace.impl.EmployeeRaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceTest {

    EmployeeRaceRepositoryImpl repository;
    EmployeeRace employeeRace;

    @Before
    public void setUp(){
        repository = EmployeeRaceRepositoryImpl.getRepository();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("216062241", 1);
    }

    @Test
    public void getEmpID() {
        assertNotNull(employeeRace.getEmpID());
        System.out.println("Employee Race ID: "+employeeRace.getEmpID());
    }

    @Test
    public void getCode() {
        assertNotNull(employeeRace.getCode());
        System.out.println("Employee Race Code: "+employeeRace.getCode());
    }
}