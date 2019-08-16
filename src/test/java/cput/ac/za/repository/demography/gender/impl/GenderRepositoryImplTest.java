package cput.ac.za.repository.demography.gender.impl;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.factory.demography.gender.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepositoryImpl repository;
    private Gender gender;
    @Before
    public void setUp(){
        repository = GenderRepositoryImpl.getRepository();
        System.out.println("Created");
        gender = GenderFactory.buildGender(1, "Male");
        repository.create(gender);
        gender = GenderFactory.buildGender(2, "Female");
        repository.create(gender);
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println("Gender repository :"+repository);
    }

    @Test
    public void getAll() {
        repository.create(gender);
        assertNotNull(repository.getAll());
        System.out.println("Gender get All :\n"+repository.getAll());
    }

    @Test
    public void create() {
        assertNotNull(repository.read(1));
        System.out.println(repository.read(1));
        assertNotNull(repository.read(2));
        System.out.println(repository.read(2));
    }

    @Test
    public void read() {
        assertNotNull(repository.read(1));
        System.out.println("Gender Read" + repository.read(1));
    }

    @Test
    public void update() {
        Gender gu = GenderFactory.buildGender(1, "Not Say");
        repository.update(gu);
        Gender GenderChange = repository.read(1);
        assertNotEquals(gender.getGenderType(), GenderChange.getGenderType());
        System.out.println("Updated : "+repository.read(1));
    }

    @Test
    public void delete() {
        repository.delete(1);
        assertNull(repository.read(1));
        System.out.println(repository.read(1));
    }

    @Test
    public void getGender() {
        assertNotNull(repository.getGender("Female"));
        Gender g = repository.getGender("Female");
        System.out.println(g.getGenderType());
    }
}