package cput.ac.za.factory.user;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.demography.GenderFactory;

public class EmployeeFactory {

    public static Employee buildEmployee(String empNumber, String firstName, String surname, String gender){

        Gender genderBuild = GenderFactory.buildGender(empNumber, gender);
        return new Employee.Builder()
                .empNumber(empNumber)
                .firstName(firstName)
                .surname(surname)
                .gender(genderBuild).Build();
    }
}
