package cput.ac.za.factory.demography.race;

import cput.ac.za.domain.demography.race.Race;

public class RaceFactory {
    public static Race raceBuild(int code, String type){
        return new Race.Builder()
                .code(code)
                .RaceType(type)
                .Build();
    }
}
