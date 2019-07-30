package cput.ac.za.repository.user;

import cput.ac.za.domain.user.Employee;

import java.util.*;

public class EmployeeRepository implements IEmployeeRepository{

    private static EmployeeRepository repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepository() {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepository();
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
