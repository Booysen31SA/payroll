package cput.ac.za.factory.employee;
import cput.ac.za.domain.employee.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    private Employee employee;
    @Before
    public void setUp(){
        employee = EmployeeFactory.buildEmployee("216062241", "Matthew", "Booysen");
    }

    @Test
    public void buildEmployee() {
        assertNotNull(employee);
        System.out.println("Employee Factory \n"+employee);
    }
}