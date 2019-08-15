package cput.ac.za.factory.employee.AdditionalDetails.employeeRace;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    private EmployeeRace employeeRace;
    @Before
    public void setUp(){
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("216062241", 1);
    }

    @Test
    public void buildEmployeeRace() {
        assertNotNull(employeeRace);
        System.out.println("Employee Race Factory : " +employeeRace);
    }
}