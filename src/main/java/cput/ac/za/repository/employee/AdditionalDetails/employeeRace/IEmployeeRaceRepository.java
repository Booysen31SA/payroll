package cput.ac.za.repository.employee.AdditionalDetails.employeeRace;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IEmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();

}
