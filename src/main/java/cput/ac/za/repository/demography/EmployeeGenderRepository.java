package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.EmployeeGender;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepository implements IEmployeeGenderRepository {

    public static EmployeeGenderRepository repository;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepository() {
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepository getRepository(){
        if(repository == null) repository = new EmployeeGenderRepository();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenders;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmpNumber()) == null){
            employeeGenders.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenders.stream()
                .filter(gender -> s.equalsIgnoreCase(gender.getEmpNumber()))
                .findAny()
                .orElse(null);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {

        if(read(employeeGender.getEmpNumber()) != null){
           delete(employeeGender.getEmpNumber());
           create(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public void delete(String s) {
       EmployeeGender employeeGender = read(s);
       this.employeeGenders.remove(employeeGender);
    }
}
