package cput.ac.za.domain.employee;

import cput.ac.za.factory.employee.EmployeeFactory;
import cput.ac.za.repository.employee.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    EmployeeRepositoryImpl repository;
    Employee employee;

    @Before
    public void setUp(){
        repository = EmployeeRepositoryImpl.getRepository();
        employee = EmployeeFactory.buildEmployee("216062241", "Matthew", "Booysen");
    }

    @Test
    public void getEmpNumber() {
        assertNotNull(employee.getEmpNumber());
        System.out.println("Employee EmpNumber : "+ employee.getEmpNumber());

    }

    @Test
    public void getEmpFirstName() {
        assertNotNull(employee.getEmpFirstName());
        System.out.println("Employee First name : "+ employee.getEmpFirstName());
    }

    @Test
    public void getEmpSurname() {
        assertNotNull(employee.getEmpSurname());
        System.out.println("Employee Surname : "+ employee.getEmpSurname());
    }
}