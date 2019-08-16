package cput.ac.za.factory.demography.race;

import cput.ac.za.domain.demography.race.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private Race race;
    @Before
    public void setUp(){
        race = RaceFactory.raceBuild(1, "Coloured");
    }

    @Test
    public void raceBuild() {
        assertNotNull(race);
        System.out.println("Race Factory : "+race);
    }
}