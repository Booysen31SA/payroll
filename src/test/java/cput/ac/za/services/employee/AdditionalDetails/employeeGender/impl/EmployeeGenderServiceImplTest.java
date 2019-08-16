package cput.ac.za.services.employee.AdditionalDetails.employeeGender.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import cput.ac.za.factory.employee.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderServiceImpl service;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() {
        service = EmployeeGenderServiceImpl.getService();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", 1);
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
        service.create(employeeGender);
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
        service.create(employeeGender); //Because value gets deleted
        System.out.println(service.read("216062241"));

        EmployeeGender genderUpdated = EmployeeGenderFactory.buildEmployeeGender("216062241", 2);
        service.update(genderUpdated);
        EmployeeGender em = service.read("216062241");
        assertNotEquals(employeeGender.getCode(), em.getCode());
        System.out.println("Updated\n"+service.read("216062241"));
    }

    @Test
    public void delete() {
        service.delete("216062241");
        assertNull(service.read(employeeGender.getEmpID()));
        System.out.println("Delete\n"+service.read(employeeGender.getEmpID()));
    }
}