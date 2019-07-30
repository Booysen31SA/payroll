package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.service.IService;

import java.util.Set;

public interface IRaceService extends IService<Race, String> {
    Set<Race> getAll();
}
