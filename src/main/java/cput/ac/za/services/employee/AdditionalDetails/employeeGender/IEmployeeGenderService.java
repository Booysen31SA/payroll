package cput.ac.za.services.employee.AdditionalDetails.employeeGender;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.repository.IRepository;
import cput.ac.za.services.IService;

import java.util.Set;

public interface IEmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
