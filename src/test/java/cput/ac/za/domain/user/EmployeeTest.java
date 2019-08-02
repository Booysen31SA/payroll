package cput.ac.za.domain.user;

import cput.ac.za.factory.user.EmployeeFactory;
import cput.ac.za.repository.user.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employeeRepository = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee("216062241", "Matthew", "Booysen", "Male", "Coloured");
    }

    @Test
    public void getEmpNumber() {
        assertNotNull(employee.getEmpNumber());
        System.out.println(employee.getEmpNumber());
    }

    @Test
    public void getFirstName() {
        assertNotNull(employee.getFirstName());
        System.out.println(employee.getFirstName());
    }

    @Test
    public void getSurname() {
        assertNotNull(employee.getSurname());
        System.out.println(employee.getSurname());
    }

    @Test
    public void getGender() {
        assertNotNull(employee.getEmployeeGender().getEmpNumber());
        System.out.println(employee.getEmployeeGender().getGender());
    }

    @Test
    public void getRace() {
        assertNotNull(employee.getRace().getEmpNumber());
        System.out.println(employee.getRace().getRace());
    }
}