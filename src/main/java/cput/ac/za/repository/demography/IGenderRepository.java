package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.repository.IRepostitory;

import java.util.Set;

public interface IGenderRepository extends IRepostitory<Gender, String> {
    Set<Gender> getAll();
}
