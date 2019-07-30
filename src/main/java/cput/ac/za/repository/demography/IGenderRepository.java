package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IGenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
