package cput.ac.za.repository.demography.gender.impl;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.repository.demography.gender.IGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements IGenderRepository {


    public static GenderRepositoryImpl repository;
    private Set<Gender> genders;

    private GenderRepositoryImpl() {
        this.genders = new HashSet<>();
    }

    public static GenderRepositoryImpl getRepository(){
        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return genders;
    }

    @Override
    public Gender create(Gender gender) {
        if(read(gender.getCode()) == null){
            genders.add(gender);
        }
        return gender;
    }

    @Override
    public Gender read(Integer s) {
        return genders.stream()
                .filter(gender -> s ==(gender.getCode()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Gender update(Gender gender) {

        if(read(gender.getCode()) != null){
            delete(gender.getCode());
            create(gender);
        }
        return gender;
    }

    @Override
    public void delete(Integer s) {
        Gender gender = read(s);
        this.genders.remove(gender);
    }
}