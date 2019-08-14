package cput.ac.za.services.employee.AdditionalDetails.employeeGender.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.repository.employee.AdditionalDetails.employeeGender.IEmployeeGenderRepository;
import cput.ac.za.repository.employee.AdditionalDetails.employeeGender.impl.EmployeeGenderRepositoryImpl;
import cput.ac.za.services.employee.AdditionalDetails.employeeGender.IEmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements IEmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private IEmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService(){
        if(service == null){service = new EmployeeGenderServiceImpl();}
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employee) {
        return this.repository.create(employee);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
