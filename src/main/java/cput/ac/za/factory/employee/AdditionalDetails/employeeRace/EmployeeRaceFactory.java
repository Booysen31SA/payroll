package cput.ac.za.factory.employee.AdditionalDetails.employeeRace;

import cput.ac.za.domain.employee.AdditionalDetails.employeeRace.EmployeeRace;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(String empID, int code){
        return new EmployeeRace.Builder()
                .empID(empID)
                .code(code)
                .Build();
    }
}
