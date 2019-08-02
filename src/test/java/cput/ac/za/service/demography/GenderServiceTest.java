package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.factory.demography.GenderFactory;
import cput.ac.za.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceTest {

    GenderService service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.buildGender("216062241"
                , "Male");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(gender);
        assertNotNull(service.read("216062241"));
        System.out.println("Created\n" + service.read("216062241"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("216062241"));
        System.out.println("Read\n"+ service.read("216062241"));
    }

    @Test
    public void update() {
        service.create(gender); //Because value gets deleted
        System.out.println(service.read("216062241"));

        Gender genderUpdated = GenderFactory.buildGender("216062241", "Updated");
        service.update(genderUpdated);
        Gender g = service.read("216062241");
        assertNotEquals(gender.getGender(), g.getGender());
        System.out.println("Updated\n"+service.read("216062241"));
    }

    @Test
    public void delete() {
        service.delete("216062241");
        assertNull(service.read(gender.getEmpNumber()));
        System.out.println("Delete\n"+service.read(gender.getEmpNumber()));
    }
}