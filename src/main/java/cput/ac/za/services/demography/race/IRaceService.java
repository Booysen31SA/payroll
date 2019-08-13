package cput.ac.za.services.demography.race;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.services.IService;
import java.util.Set;

public interface IRaceService extends IService<Race, Integer> {
    Set<Race> getAll();
}
