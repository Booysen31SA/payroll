package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(String id, String gender){
        return new Gender.Builder()
                .id(id)
                .gender(gender)
                .Build();
    }
}
