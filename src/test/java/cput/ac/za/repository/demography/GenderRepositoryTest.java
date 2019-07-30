package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("216062241"
                                             , "Male");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(gender); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create() {
        repository.create(gender);
        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Created\n" + repository.read("216062241"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Read\n" + repository.read("216062241")); //id delete Test is enabled this test will come back as Error
    }
    @Test
    public void update() {

        Gender genderUpdate = GenderFactory.buildGender("216062241"
                                                          , "Updated");
      repository.update(genderUpdate);
        System.out.println(repository.read("216062241"));
    }

   @Test
    public void delete() {
        repository.delete(gender.getEmpNumber());
        assertNull(repository.read("216062241"));
       System.out.println("Deleted\n" + repository.read("216062241"));
    }
}