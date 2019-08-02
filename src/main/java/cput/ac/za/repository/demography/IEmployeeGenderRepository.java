package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IEmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
