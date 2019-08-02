package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(String empNumber, String gender){
           return new Gender.Builder()
                   .empNumber(empNumber)
                   .gender(gender)
                   .Build();
    }
}
