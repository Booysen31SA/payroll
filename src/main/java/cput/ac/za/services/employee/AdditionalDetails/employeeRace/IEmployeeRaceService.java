package cput.ac.za.services.employee.AdditionalDetails.employeeRace;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IEmployeeRaceService extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
