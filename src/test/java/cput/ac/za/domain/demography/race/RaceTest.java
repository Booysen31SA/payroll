package cput.ac.za.domain.demography.race;

import cput.ac.za.factory.demography.race.RaceFactory;
import cput.ac.za.repository.demography.race.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    RaceRepositoryImpl repository;
    Race race;

    @Before
    public void setUp(){
        repository = RaceRepositoryImpl.getRepository();
        race = RaceFactory.raceBuild(1, "Coloured");
    }

    @Test
    public void getCode() {
        assertNotNull(race.getCode());
        System.out.println("Race Code : " +race.getCode());
    }

    @Test
    public void getRaceType() {
        assertNotNull(race.getRaceType());
        System.out.println("Race Type : " +race.getRaceType());
    }
}