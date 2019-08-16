package cput.ac.za.services.employee.impl;

import cput.ac.za.domain.employee.Employee;
import cput.ac.za.factory.employee.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl service;
    private Employee employee;

    @Before
    public void setUp() {
        service = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.buildEmployee("216062241", "Matthew", "Booysen");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(employee);
        assertNotNull(service.read("216062241"));
        System.out.println("Created\n" + service.read("216062241"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("216062241"));
        System.out.println("Read\n"+ service.read("216062241"));
    }

    @Test
    public void update() {
        service.create(employee); //Because value gets deleted
        System.out.println(service.read("216062241"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee("216062241", "Matthew", "Peterson");
        service.update(employeeUpdated);
        Employee em = service.read("216062241");
        assertNotEquals(employee.getEmpSurname(), em.getEmpSurname());
        System.out.println("Updated\n"+service.read("216062241"));
    }

    @Test
    public void delete() {
        service.delete("216062241");
        assertNull(service.read(employee.getEmpNumber()));
        System.out.println("Delete\n"+service.read(employee.getEmpNumber()));
    }
}