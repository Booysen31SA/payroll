package cput.ac.za.repository.demography.race.impl;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.factory.demography.race.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepositoryImpl repository;
    private Race race;

    @Before
    public void setUp(){
        repository = RaceRepositoryImpl.getRepository();
        System.out.println("Created");
        race = RaceFactory.raceBuild(1, "Coloured");
        repository.create(race);
        race = RaceFactory.raceBuild(2, "White");
        repository.create(race);
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println("Race repository :"+repository);
    }

    @Test
    public void getAll() {
        repository.create(race);
        assertNotNull(repository.getAll());
        System.out.println("Gender get All :\n"+repository.getAll());
    }

    @Test
    public void getRace() {
        assertNotNull(repository.getRace("White"));
        Race g = repository.getRace("White");
        System.out.println(g.getRaceType());
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
        System.out.println("Race Read" + repository.read(1));
    }

    @Test
    public void update() {
        Race gu = RaceFactory.raceBuild(1, "Not Say");
        repository.update(gu);
        Race GenderChange = repository.read(1);
        assertNotEquals(race.getRaceType(), GenderChange.getRaceType());
        System.out.println("Updated : "+repository.read(1));
    }

    @Test
    public void delete() {
        repository.delete(1);
        assertNull(repository.read(1));
        System.out.println(repository.read(1));
    }
}