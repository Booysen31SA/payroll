package cput.ac.za.domain.demography;

public class Gender {
    private String empNumber;
    private String gender;

    public Gender(Gender.Builder Build){
        this.empNumber = Build.empNumber;
        this.gender = Build.gender;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getGender() {
        return gender;
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

        public Gender Build(){
            return new Gender(this);
        }
    }
}
