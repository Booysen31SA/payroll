package cput.ac.za.repository.demography.gender;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.repository.IRepository;

import java.util.Set;

public interface IGenderRepository extends IRepository <Gender, Integer>{
    Set<Gender> getAll();
    Gender getGender(String id);
}
