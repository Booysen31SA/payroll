package cput.ac.za.domain.employee.AdditionalDetails.employeeRace;

public class EmployeeRace {

    private String empID;
    private int code;

    public EmployeeRace(Builder Build){
        this.empID = Build.empID;
        this.code = Build.code;
    }

    public String getEmpID() {
        return empID;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "empID='" + empID + '\'' +
                ", code=" + code +
                '}';
    }

    public static class Builder{
        private String empID;
        private int code;

        public Builder empID(String empID){
            this.empID = empID;
            return this;
        }
        public Builder code(int code){
            this.code = code;
            return this;
        }
        public EmployeeRace Build(){
            return new EmployeeRace(this);
        }
    }
}

