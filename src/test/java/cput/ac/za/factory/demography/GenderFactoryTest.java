package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.repository.demography.GenderRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {
    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        repository = GenderRepository.getRepository();

    }

    @Test
    public void buildGender() {
        gender = GenderFactory.buildGender("Male", "Male");
        repository.create(gender);
        assertNotNull(repository.read("Male"));
    }
}