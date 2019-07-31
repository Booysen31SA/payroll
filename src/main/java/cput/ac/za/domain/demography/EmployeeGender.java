package cput.ac.za.domain.demography;

public class EmployeeGender {
    private String empNumber;
    private String gender;

    public EmployeeGender(EmployeeGender.Builder Build){
        this.empNumber = Build.empNumber;
        this.gender = Build.gender;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  "Employee Number :" + empNumber +
                "\nEmployeeGender          :" + gender ;
    }

    public static class Builder{
        private String empNumber;
        private String gender;

        public Builder empNumber(String empNumber){
            this.empNumber = empNumber;
            return this;
        }
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeGender Build(){
            return new EmployeeGender(this);
        }
    }

}
