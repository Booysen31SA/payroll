package cput.ac.za.services.employee.AdditionalDetails.employeeRace.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.repository.employee.AdditionalDetails.employeeRace.IEmployeeRaceRepository;
import cput.ac.za.repository.employee.AdditionalDetails.employeeRace.impl.EmployeeRaceRepositoryImpl;
import cput.ac.za.services.employee.AdditionalDetails.employeeRace.IEmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements IEmployeeRaceService {
    private static EmployeeRaceServiceImpl service = null;
    private IEmployeeRaceRepository repository;

    private EmployeeRaceServiceImpl() {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
    }

    public static EmployeeRaceServiceImpl getService() {
        if (service == null) {
            service = new EmployeeRaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeRace create(EmployeeRace employee) {
        return this.repository.create(employee);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeRace update(EmployeeRace employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
