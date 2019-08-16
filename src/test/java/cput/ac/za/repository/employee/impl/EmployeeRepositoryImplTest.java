package cput.ac.za.repository.employee.impl;

import cput.ac.za.domain.employee.Employee;
import cput.ac.za.factory.employee.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    private EmployeeRepositoryImpl repository;
    private Employee employee;
    @Before
    public void setUp(){
        repository = EmployeeRepositoryImpl.getRepository();
        System.out.println("Created");
        employee = EmployeeFactory.buildEmployee("216062241", "Matthew", "Booysen");
        repository.create(employee);
        employee = EmployeeFactory.buildEmployee("216062242", "Matthew", "Peterson");
        repository.create(employee);
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println("Employee repository :"+repository);
    }

    @Test
    public void getAll() {
        assertNotNull(repository.getAll());
        System.out.println("Employee get All :\n"+repository.getAll());
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
        System.out.println("Employee Read" + repository.read("216062241"));
    }

    @Test
    public void update() {
        Employee employeeu = EmployeeFactory.buildEmployee("216062242", "Matthew", "Jogns");
        repository.update(employeeu);
        Employee EmployeeChange = repository.read("216062242");
        assertNotEquals(employee.getEmpSurname(), employeeu.getEmpSurname());
        System.out.println("Updated : "+repository.read("216062242"));
    }

    @Test
    public void delete() {
        repository.delete("216062242");
        assertNull(repository.read("216062242"));
        System.out.println(repository.read("216062242"));
    }

    @Test
    public void getEmployee() {
    }
}