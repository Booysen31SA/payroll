package cput.ac.za.repository.employee.AdditionalDetails.employeeRace.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.factory.employee.AdditionalDetails.employeeRace.EmployeeRaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceRepositoryImplTest {

    private EmployeeRaceRepositoryImpl repository;
    private EmployeeRace employeeRace;
    @Before
    public void setUp(){
        repository = EmployeeRaceRepositoryImpl.getRepository();
        System.out.println("Created");
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("216062241", 1);
        repository.create(employeeRace);
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("216062242", 2);
        repository.create(employeeRace);
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println("employeeRace repository :"+repository);
    }

    @Test
    public void getAll() {
        repository.create(employeeRace);
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
        EmployeeRace gu = EmployeeRaceFactory.buildEmployeeRace("216062241", 3);
        repository.update(gu);
        EmployeeRace EmployeeRaceChange = repository.read("216062241");
        assertNotEquals(employeeRace.getCode(), EmployeeRaceChange.getCode());
        System.out.println("Updated : "+repository.read("216062241"));
    }

    @Test
    public void delete() {
        repository.delete("216062242");
        assertNull(repository.read("216062242"));
        System.out.println(repository.read("216062242"));
    }
}