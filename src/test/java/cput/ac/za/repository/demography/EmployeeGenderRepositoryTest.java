package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.factory.demography.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryTest {

    EmployeeGenderRepository repository;
    EmployeeGender employeeGender;

    @Before
    public void setUp() {
        repository = EmployeeGenderRepository.getRepository();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("216062241"
                                             , "Male");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(employeeGender); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create() {
        repository.create(employeeGender);
        assertNotNull(repository.read(employeeGender.getEmpNumber()));
        System.out.println("Created\n" + repository.read("216062241"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read(employeeGender.getEmpNumber()));
        System.out.println("Read\n" + repository.read("216062241")); //id delete Test is enabled this test will come back as Error
    }
    @Test
    public void update() {

        EmployeeGender employeeGenderUpdate = EmployeeGenderFactory.buildEmployeeGender("216062241"
                                                          , "Updated");
      repository.update(employeeGenderUpdate);
        System.out.println(repository.read("216062241"));
    }

   @Test
    public void delete() {
        repository.delete(employeeGender.getEmpNumber());
        assertNull(repository.read("216062241"));
       System.out.println("Deleted\n" + repository.read("216062241"));
    }
}