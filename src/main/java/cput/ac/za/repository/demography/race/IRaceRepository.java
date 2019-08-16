package cput.ac.za.repository.demography.race;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race, Integer> {
    Set<Race> getAll();
    Race getRace(String id);
}
