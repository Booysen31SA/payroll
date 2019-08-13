package cput.ac.za.services.demography.gender.impl;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.repository.demography.gender.IGenderRepository;
import cput.ac.za.repository.demography.gender.impl.GenderRepositoryImpl;
import cput.ac.za.services.demography.gender.IGenderService;

import java.util.Set;

public class GenderServiceImpl implements IGenderService {

    private static GenderServiceImpl service = null;
    private IGenderRepository repository;

    private GenderServiceImpl(){this.repository = GenderRepositoryImpl.getRepository();}

    public static GenderServiceImpl getService(){if(service == null){service = new GenderServiceImpl();}
        return service;
    }
    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender read(Integer s) {
        return this.repository.read(s);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(Integer s) {
        this.repository.delete(s);
    }
}
