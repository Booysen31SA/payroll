package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
