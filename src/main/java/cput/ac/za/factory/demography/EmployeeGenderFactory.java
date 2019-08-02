package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empNumber, String gender){
           return new EmployeeGender.Builder()
                   .empNumber(empNumber)
                   .gender(gender)
                   .Build();
    }
}
