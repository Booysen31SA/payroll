package cput.ac.za.domain.employee;

public class Employee {

    private String empNumber;
    private String empFirstName;
    private String empSurname;

    public Employee(Employee.Builder Build){
        this.empNumber = Build.empNumber;
        this.empFirstName = Build.empFirstName;
        this.empSurname = Build.empSurname;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    @Override
    public String toString() {
        return
                "Employee Number :'" + empNumber +
                "\nFirst Name      :" + empFirstName +
                "\nSurname         :" + empSurname;
    }

    public static class Builder{
        private String empNumber;
        private String empFirstName;
        private String empSurname;

        public Builder empNumber(String empNumber){
            this.empNumber = empNumber;
            return this;
        }
        public Builder empFirstName(String name){
            this.empFirstName = name;
            return this;
        }
        public Builder empSurname(String surname){
            this.empSurname = surname;
            return this;
        }
        public Employee Build(){
            return new Employee(this);
        }
    }
}
