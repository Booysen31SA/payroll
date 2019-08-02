package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.service.IService;

import java.util.Set;

public interface IEmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
