package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements IGenderRepository {
    public static GenderRepository repository;
    private Set<Gender> genders;

    private GenderRepository() {
        this.genders = new HashSet<>();
    }

    public static GenderRepository getRepository(){
        if(repository == null) repository = new GenderRepository();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return genders;
    }

    @Override
    public Gender create(Gender employeeGender) {
        if(read(employeeGender.getId()) == null){
            genders.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public Gender read(String s) {
        return genders.stream()
                .filter(gender -> s.equalsIgnoreCase(gender.getId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Gender update(Gender employeeGender) {

        if(read(employeeGender.getId()) != null){
            delete(employeeGender.getId());
            create(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public void delete(String s) {
        Gender gender = read(s);
        this.genders.remove(gender);
    }
}