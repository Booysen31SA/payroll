package cput.ac.za.factory.demography.gender;

import cput.ac.za.domain.demography.gender.Gender;

public class GenderFactory {

    public static Gender buildGender(int code, String type){
      return new Gender.Builder()
              .code(code)
              .genderType(type)
              .Build();
    }
}
