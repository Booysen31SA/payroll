package cput.ac.za.services.demography.gender.impl;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.factory.demography.gender.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderServiceImpl service;
    private Gender gender;

    @Before
    public void setUp() {
        service = GenderServiceImpl.getService();
        gender = GenderFactory.buildGender(1 , "Male");
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
        assertNotNull(service.read(1));
        System.out.println("Created\n" + service.read(1));
    }

    @Test
    public void read() {
        assertNotNull(service.read(1));
        System.out.println("Read\n"+ service.read(1));
    }

    @Test
    public void update() {
        service.create(gender); //Because value gets deleted
        System.out.println(service.read(1));

        Gender genderUpdated = GenderFactory.buildGender(1, "Female");
        service.update(genderUpdated);
        Gender em = service.read(1);
        assertNotEquals(gender.getGenderType(), em.getGenderType());
        System.out.println("Updated\n"+service.read(1));
    }

    @Test
    public void delete() {
        service.delete(1);
        assertNull(service.read(gender.getCode()));
        System.out.println("Delete\n"+service.read(gender.getCode()));
    }
}