package cput.ac.za.services.demography.race.impl;

import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.factory.demography.race.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceServiceImpl service;
    private Race race;

    @Before
    public void setUp() {
        service = RaceServiceImpl.getService();
        race = RaceFactory.raceBuild(1, "Coloured");
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
        service.create(race);
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
        service.create(race); //Because value gets deleted
        System.out.println(service.read(1));

        Race genderUpdated = RaceFactory.raceBuild(1, "White");
        service.update(genderUpdated);
        Race em = service.read(1);
        assertNotEquals(race.getRaceType(), em.getRaceType());
        System.out.println("Updated\n"+service.read(1));
    }

    @Test
    public void delete() {
        service.delete(1);
        assertNull(service.read(race.getCode()));
        System.out.println("Delete\n"+service.read(race.getCode()));
    }
}