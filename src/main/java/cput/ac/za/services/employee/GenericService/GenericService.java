package cput.ac.za.services.employee.GenericService;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.domain.demography.race.Race;
import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;
import cput.ac.za.domain.employee.Employee;
import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import cput.ac.za.factory.employee.AdditionalDetails.employeeRace.EmployeeRaceFactory;
import cput.ac.za.factory.employee.EmployeeFactory;
import cput.ac.za.services.demography.gender.impl.GenderServiceImpl;
import cput.ac.za.services.demography.race.impl.RaceServiceImpl;
import cput.ac.za.services.employee.AdditionalDetails.employeeGender.impl.EmployeeGenderServiceImpl;
import cput.ac.za.services.employee.AdditionalDetails.employeeRace.impl.EmployeeRaceServiceImpl;
import cput.ac.za.services.employee.impl.EmployeeServiceImpl;

public class GenericService {

    public static Employee createEmployee(String empNumber, String fname, String lName, String gender, String race){
        Employee employee = EmployeeFactory.buildEmployee(empNumber, fname, lName);
        Gender g = GenderServiceImpl.getService().getGender(gender);
        Race r = RaceServiceImpl.getService().getRace(race);
        EmployeeGender eg = EmployeeGenderFactory.buildEmployeeGender(employee.getEmpNumber(), g.getCode());
        EmployeeRace er = EmployeeRaceFactory.buildEmployeeRace(employee.getEmpNumber(), r.getCode());
        EmployeeServiceImpl.getService().create(employee);
        EmployeeGenderServiceImpl.getService().create(eg);
        EmployeeRaceServiceImpl.getService().create(er);
        System.out.println(er);
        System.out.println(eg);
        return employee;
    }
}

