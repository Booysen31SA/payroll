package cput.ac.za.services.demography.race.impl;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.repository.demography.race.IRaceRepository;
import cput.ac.za.repository.demography.race.impl.RaceRepositoryImpl;
import cput.ac.za.services.demography.race.IRaceService;

import java.util.Set;

public class RaceServiceImpl implements IRaceService {

    private static RaceServiceImpl service = null;
    private IRaceRepository repository;

    private RaceServiceImpl(){this.repository = RaceRepositoryImpl.getRepository();}

    public static RaceServiceImpl getService(){if(service == null){service = new RaceServiceImpl();}
        return service;
    }
    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race getRace(String id) {
        return repository.getRace(id);
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race read(Integer s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(Integer s) {
        this.repository.delete(s);
    }

}
