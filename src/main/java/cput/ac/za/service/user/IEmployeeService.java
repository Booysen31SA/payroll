package cput.ac.za.service.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.service.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
