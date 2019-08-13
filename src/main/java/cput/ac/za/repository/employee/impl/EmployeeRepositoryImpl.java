package cput.ac.za.repository.employee.impl;

import cput.ac.za.domain.employee.Employee;
import cput.ac.za.repository.employee.IEmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        if(read(employee.getEmpNumber())  == null){
            this.employees.put(employee.getEmpNumber(),employee);
        }
        return employee;
    }

    @Override
    public Employee read(String s) {
        return this.employees.get(s);
    }

    @Override
    public Employee update(Employee employee) {
        if(read(employee.getEmpNumber()) != null){
            employees.replace(employee.getEmpNumber(), employee);
        }
        return employee;
    }

    @Override
    public void delete(String s) {
        Employee employee = read(s);
        this.employees.remove(s, employee);
    }
}