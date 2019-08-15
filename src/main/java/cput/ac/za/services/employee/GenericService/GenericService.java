package cput.ac.za.services.employee.GenericService;

import cput.ac.za.domain.demography.gender.Gender;
import cput.ac.za.domain.employee.AdditionalDetails.employeeGender.EmployeeGender;
import cput.ac.za.domain.employee.Employee;
import cput.ac.za.factory.employee.AdditionalDetails.employeeGender.EmployeeGenderFactory;
import cput.ac.za.factory.employee.EmployeeFactory;
import cput.ac.za.services.demography.gender.impl.GenderServiceImpl;
import cput.ac.za.services.employee.AdditionalDetails.employeeGender.impl.EmployeeGenderServiceImpl;
import cput.ac.za.services.employee.impl.EmployeeServiceImpl;

public class GenericService {

    public Employee createEmployee(String empNumber, String fname, String lName, String gender, String race){
        Employee employee = EmployeeFactory.buildEmployee(empNumber, fname, lName);
        Gender g = GenderServiceImpl.getService().getGender(gender);
        EmployeeGender eg = EmployeeGenderFactory.buildEmployeeGender(employee.getEmpNumber(), g.getCode());
        EmployeeServiceImpl.getService().create(employee);
        EmployeeGenderServiceImpl.getService().create(eg);
        return employee;
    }
}

