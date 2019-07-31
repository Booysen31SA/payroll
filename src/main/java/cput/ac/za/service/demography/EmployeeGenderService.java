package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.repository.demography.EmployeeGenderRepository;
import cput.ac.za.repository.demography.IEmployeeGenderRepository;

import java.util.Set;

public class EmployeeGenderService implements IEmployeeGenderService {

    private static EmployeeGenderService service = null;
    private IEmployeeGenderRepository repository;

    private EmployeeGenderService(){this.repository = EmployeeGenderRepository.getRepository();}

    public static EmployeeGenderService getService(){if(service == null){service = new EmployeeGenderService();}
    return service;
    }
    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
       this.repository.delete(s);
    }
}
