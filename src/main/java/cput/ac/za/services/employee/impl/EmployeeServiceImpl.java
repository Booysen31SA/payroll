package cput.ac.za.services.employee.impl;
import cput.ac.za.domain.employee.Employee;
import cput.ac.za.repository.employee.IEmployeeRepository;
import cput.ac.za.repository.employee.impl.EmployeeRepositoryImpl;
import cput.ac.za.services.employee.IEmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements IEmployeeService {

    private static EmployeeServiceImpl service = null;
    private IEmployeeRepository repository;

    private EmployeeServiceImpl(){this.repository = EmployeeRepositoryImpl.getRepository();}

    public static EmployeeServiceImpl getService(){
        if(service == null){service = new EmployeeServiceImpl();}
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}

