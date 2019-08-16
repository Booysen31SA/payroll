package cput.ac.za.services.employee;

import cput.ac.za.domain.employee.Employee;
import cput.ac.za.services.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
