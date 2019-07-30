package cput.ac.za.service.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.repository.user.EmployeeRepository;
import cput.ac.za.repository.user.IEmployeeRepository;

import java.util.Set;

public class EmployeeService implements IEmployeeService {

    private EmployeeService service = null;
    private IEmployeeRepository repository;

    private EmployeeService(){this.repository = EmployeeRepository.getRepository();}

    public EmployeeService getService(){
        if(service == null){service = new EmployeeService();}
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
