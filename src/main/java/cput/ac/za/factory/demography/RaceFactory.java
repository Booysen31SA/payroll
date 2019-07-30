package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace(String empNumber, String race){
        return new Race.Builder()
                .empNumber(empNumber)
                .race(race)
                .Build();

    }
}
