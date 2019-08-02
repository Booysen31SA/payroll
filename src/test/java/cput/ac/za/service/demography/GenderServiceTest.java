package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceTest {

    GenderService service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.buildGender("Male", "Male");

    }

    @Test
    public void getService() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(gender);
        assertNotNull(service.read("Male"));
        System.out.println("Read\n"+service.read("Male"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("Male"));
        System.out.println("Read\n"+service.read("Male"));
    }

    @Test
    public void update() {
        service.create(gender);
        Gender genderUpdate = GenderFactory.buildGender("Male", "Female");
        service.update(genderUpdate);
        assertNotEquals(gender.getGender(), service.read("Male").getGender());
        System.out.println("Updated"+service.read("Male"));
    }

    @Test
    public void delete() {
        service.delete("Male");
        assertNull(service.read("Male"));
        System.out.println("Deleted\n"+service.read("Male"));
    }
}