package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.repository.demography.IRaceRepository;
import cput.ac.za.repository.demography.RaceRepository;

import java.util.Set;

public class RaceService implements IRaceService {

    private static RaceService service = null;
    private IRaceRepository repository;

    private RaceService(){this.repository = RaceRepository.getRepository();}

    public static RaceService getService(){if(service == null){service = new RaceService();}
        return service;
    }
    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
