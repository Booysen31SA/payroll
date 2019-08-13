package cput.ac.za.factory.employee;

import cput.ac.za.domain.employee.Employee;

public class EmployeeFactory {

    public static Employee buildEmployee(String empNumber, String empFirstName, String empSurname){
        return new Employee.Builder()
                .empNumber(empNumber)
                .empFirstName(empFirstName)
                .empSurname(empSurname)
                .Build();
    }
}
