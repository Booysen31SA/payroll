package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("Male", "Male");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        repository.create(gender);
        assertNotNull(repository.read("Male"));
        System.out.println("Created\n"+repository.read("Male"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read("Male"));
        System.out.println("Read\n"+repository.read("Male"));
    }

    @Test
    public void update() {
        repository.create(gender);
        Gender genderUpdate = GenderFactory.buildGender("Male", "Female");
        repository.update(genderUpdate);
        assertNotEquals(gender.getGender(), repository.read("Male").getGender());
        System.out.println("Updated"+repository.read("Male"));
    }

    @Test
    public void delete() {
        repository.delete("Male");
        assertNull(repository.read("Male"));
        System.out.println("Deleted\n"+repository.read("Male"));
    }
}