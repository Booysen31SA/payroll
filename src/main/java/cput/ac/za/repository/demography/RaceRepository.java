package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.demography.Race;

import java.util.HashSet;
import java.util.Set;

public class RaceRepository implements IRaceRepository {

    public static RaceRepository repository;
    private Set<Race> races;

    private RaceRepository() {
        this.races = new HashSet<>();
    }

    public static RaceRepository getRepository(){
        if(repository == null) repository = new RaceRepository();
        return repository;
    }


    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race create(Race race) {
        if(read(race.getEmpNumber()) == null){
            races.add(race);
        }
        return race;
    }

    @Override
    public Race read(String s) {
        return races.stream()
                .filter(gender -> s.equalsIgnoreCase(gender.getEmpNumber()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Race update(Race race) {

        if(read(race.getEmpNumber()) != null){
            delete(race.getEmpNumber());
            create(race);
        }
        return race;
    }

    @Override
    public void delete(String s) {
        Race race = read(s);
        this.races.remove(race);
    }
}
