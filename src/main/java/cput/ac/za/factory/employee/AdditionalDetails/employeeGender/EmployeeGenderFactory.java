package cput.ac.za.factory.employee.AdditionalDetails.employeeGender;

import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(String empID, int code){
        return new EmployeeGender.Builder()
                .empID(empID)
                .code(code)
                .Build();
    }
}
