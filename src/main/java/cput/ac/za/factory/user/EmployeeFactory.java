package cput.ac.za.factory.user;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.domain.demography.Race;
import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.demography.EmployeeGenderFactory;
import cput.ac.za.factory.demography.RaceFactory;

public class EmployeeFactory {

    public static Employee buildEmployee(String empNumber, String firstName, String surname, String gender, String race){

        EmployeeGender employeeGenderBuild = EmployeeGenderFactory.buildEmployeeGender(empNumber, gender);
        Race raceBuild = RaceFactory.buildRace(empNumber, race);
        return new Employee.Builder()
                .empNumber(empNumber)
                .firstName(firstName)
                .surname(surname)
                .gender(employeeGenderBuild)
                .race(raceBuild).Build();
    }
}
