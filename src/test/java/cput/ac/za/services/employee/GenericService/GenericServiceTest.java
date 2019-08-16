package cput.ac.za.services.employee.GenericService;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.domain.employee.Employee;
import cput.ac.za.factory.demography.gender.GenderFactory;
import cput.ac.za.factory.demography.race.RaceFactory;
import cput.ac.za.services.demography.gender.impl.GenderServiceImpl;
import cput.ac.za.services.demography.race.impl.RaceServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericServiceTest {

    private GenericService service;


    @Before
    public void setUp(){
        GenderServiceImpl genderService = GenderServiceImpl.getService();
        RaceServiceImpl raceService = RaceServiceImpl.getService();

        Gender gender = GenderFactory.buildGender(1, "Male");
        Race race = RaceFactory.raceBuild(1, "Coloured");
        genderService.create(gender);
        raceService.create(race);
    }

    @Test
    public void createEmployee() {
         Employee employee = GenericService.createEmployee("216062241", "Matthew", "Booysen", "Male", "Coloured");

         assertNotNull(employee);
         System.out.println(employee);
    }
}