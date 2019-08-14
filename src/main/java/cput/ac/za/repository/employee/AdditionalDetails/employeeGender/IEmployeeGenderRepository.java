package cput.ac.za.repository.employee.AdditionalDetails.employeeGender;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IEmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
