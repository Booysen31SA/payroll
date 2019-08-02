package cput.ac.za.domain.demography;

import cput.ac.za.factory.demography.GenderFactory;
import cput.ac.za.repository.demography.GenderRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("Male", "Male");
        repository.create(gender);
    }

    @Test
    public void getId() {
     assertNotNull(repository.read(gender.getId()));
     System.out.println("Get ID : " +repository.read(gender.getId()));
    }

    @Test
    public void getGender() {
        assertNotNull(repository.read(gender.getId()));
        System.out.println("Get ID : " +repository.read(gender.getId()));
    }
}