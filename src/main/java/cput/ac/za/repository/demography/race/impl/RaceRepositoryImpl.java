package cput.ac.za.repository.demography.race.impl;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.repository.demography.race.IRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements IRaceRepository {

    public static RaceRepositoryImpl repository;
    private Set<Race> races;

    private RaceRepositoryImpl() {
        this.races = new HashSet<>();
    }

    public static RaceRepositoryImpl getRepository(){
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race getRace(String id) {
        return races.stream()
                .filter(race -> id.equalsIgnoreCase(race.getRaceType()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Race create(Race race) {
        if(read(race.getCode()) == null){
            races.add(race);
        }
        return race;
    }

    @Override
    public Race read(Integer s) {
        return races.stream()
                .filter(race -> s ==(race.getCode()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Race update(Race gender) {

        if(read(gender.getCode()) != null){
            delete(gender.getCode());
            create(gender);
        }
        return gender;
    }

    @Override
    public void delete(Integer s) {
        Race race = read(s);
        this.races.remove(race);
    }
}

