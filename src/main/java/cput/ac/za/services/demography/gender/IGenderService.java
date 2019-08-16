package cput.ac.za.services.demography.gender;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.services.IService;

import java.util.Set;

public interface IGenderService extends IService<Gender, Integer> {
    Set<Gender> getAll();
    Gender getGender(String id);
}
