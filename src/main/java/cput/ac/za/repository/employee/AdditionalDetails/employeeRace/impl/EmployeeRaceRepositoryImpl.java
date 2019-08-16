package cput.ac.za.repository.employee.AdditionalDetails.employeeRace.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.repository.employee.AdditionalDetails.employeeRace.IEmployeeRaceRepository;

import java.util.*;

public class EmployeeRaceRepositoryImpl implements IEmployeeRaceRepository {

    private static EmployeeRaceRepositoryImpl repository = null;
    private Map<String, EmployeeRace> employeeRace;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRace = new HashMap<>();
    }

    public static EmployeeRaceRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        Collection<EmployeeRace> employees = this.employeeRace.values();
        Set<EmployeeRace> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        if(read(employeeRace.getEmpID()) == null){
            this.employeeRace.put(employeeRace.getEmpID(), employeeRace);
        }
        return employeeRace;
    }

    @Override
    public EmployeeRace read(String s) {
        return this.employeeRace.get(s);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        if(read(employeeRace.getEmpID()) != null){
            this.employeeRace.replace(employeeRace.getEmpID(), employeeRace);
        }
        return employeeRace;
    }

    @Override
    public void delete(String s) {
        EmployeeRace employee = read(s);
        this.employeeRace.remove(s, employee);
    }
}
