package cput.ac.za.repository.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.repository.IRepostitory;
import java.util.Set;

public interface IEmployeeRepository extends IRepostitory<Employee, String> {
       Set<Employee> getAll();
}
