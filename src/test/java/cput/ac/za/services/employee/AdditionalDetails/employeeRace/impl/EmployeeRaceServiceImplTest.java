package cput.ac.za.services.employee.AdditionalDetails.employeeRace.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.factory.employee.AdditionalDetails.employeeRace.EmployeeRaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {

    private EmployeeRaceServiceImpl service;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() {
        service = EmployeeRaceServiceImpl.getService();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("216062241", 1);
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
        service.create(employeeRace);
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
        service.create(employeeRace); //Because value gets deleted
        System.out.println(service.read("216062241"));

        EmployeeRace genderUpdated = EmployeeRaceFactory.buildEmployeeRace("216062241", 2);
        service.update(genderUpdated);
        EmployeeRace em = service.read("216062241");
        assertNotEquals(employeeRace.getCode(), em.getCode());
        System.out.println("Updated\n"+service.read("216062241"));
    }

    @Test
    public void delete() {
        service.delete("216062241");
        assertNull(service.read(employeeRace.getEmpID()));
        System.out.println("Delete\n"+service.read(employeeRace.getEmpID()));
    }
}