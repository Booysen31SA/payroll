package cput.ac.za.repository.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.repository.IRepository;
import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
       Set<Employee> getAll();
}
