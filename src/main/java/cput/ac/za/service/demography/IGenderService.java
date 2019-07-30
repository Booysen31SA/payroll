package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.service.IService;

import java.util.Set;

public interface IGenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
