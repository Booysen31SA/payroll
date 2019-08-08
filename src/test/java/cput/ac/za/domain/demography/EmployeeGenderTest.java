package cput.ac.za.domain.demography;

import cput.ac.za.factory.demography.EmployeeGenderFactory;
import cput.ac.za.repository.demography.EmployeeGenderRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("FieldCanBeLocal")
public class EmployeeGenderTest {

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;
    @Before
    public void setUp() {
    employeeGenderRepository = EmployeeGenderRepository.getRepository();

    employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", "Male");
    }

    @Test
    public void getEmpNumber() {
        assertNotNull(employeeGender.getEmpNumber());
        System.out.println(employeeGender.getEmpNumber());
    }

    @Test
    public void getGender() {
        assertNotNull(employeeGender.getGender());
        System.out.println(employeeGender.getGender());
    }
}