package cput.ac.za.repository.employee.AdditionalDetails.employeeGender.impl;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.repository.employee.AdditionalDetails.employeeGender.IEmployeeGenderRepository;

import java.util.*;

public class EmployeeGenderRepositoryImpl implements IEmployeeGenderRepository {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<String, EmployeeGender> employeeGender;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGender = new HashMap<>();
    }

    public static EmployeeGenderRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        Collection<EmployeeGender> employees = this.employeeGender.values();
        Set<EmployeeGender> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
      if(read(employeeGender.getEmpID()) == null){
          this.employeeGender.put(employeeGender.getEmpID(), employeeGender);
      }
      return employeeGender;
    }

    @Override
    public EmployeeGender read(String s) {
        return this.employeeGender.get(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmpID()) != null){
             this.employeeGender.replace(employeeGender.getEmpID(), employeeGender);

        }
        return employeeGender;
    }

    @Override
    public void delete(String s) {
        EmployeeGender employee = read(s);
        this.employeeGender.remove(s, employee);
    }
}
