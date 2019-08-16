package cput.ac.za.repository.employee;

import cput.ac.za.domain.employee.Employee;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IEmployeeRepository extends IRepository <Employee, String>{
    Set<Employee> getAll();
}
