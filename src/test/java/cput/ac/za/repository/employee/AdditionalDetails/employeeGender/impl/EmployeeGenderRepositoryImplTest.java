package cput.ac.za.repository.employee.AdditionalDetails.employeeGender.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepositoryImpl repository;
    private EmployeeGender employeeGender;
    @Before
    public void setUp(){
        repository = EmployeeGenderRepositoryImpl.getRepository();
        System.out.println("Created");
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241", 1);
        repository.create(employeeGender);
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062242", 2);
        repository.create(employeeGender);
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println("employeeGender repository :"+repository);
    }

    @Test
    public void getAll() {
        repository.create(employeeGender);
        assertNotNull(repository.getAll());
        System.out.println("employeeRace get All :\n"+repository.getAll());
    }

    @Test
    public void create() {
        assertNotNull(repository.read("216062241"));
        System.out.println(repository.read("216062241"));
        assertNotNull(repository.read("216062242"));
        System.out.println(repository.read("216062242"));
    }

    @Test
    public void read() {
        assertNotNull(repository.read("216062241"));
        System.out.println("employeeRace Read" + repository.read("216062241"));
    }

    @Test
    public void update() {
        EmployeeGender gu = EmployeeGenderFactory.buildEmployeeGender("216062241", 3);
        repository.update(gu);
        EmployeeGender EmployeeGenderChange = repository.read("216062241");
        assertNotEquals(employeeGender.getCode(), EmployeeGenderChange.getCode());
        System.out.println("Updated : "+repository.read("216062241"));
    }

    @Test
    public void delete() {
        repository.delete("216062242");
        assertNull(repository.read("216062242"));
        System.out.println(repository.read("216062242"));
    }
}