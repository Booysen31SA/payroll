package cput.ac.za.domain.user;

import cput.ac.za.domain.demography.Gender;
import cput.ac.za.domain.demography.Race;

public class Employee {

    private String empNumber; //primary Key
    private String firstName;
    private String surname;
    private Gender gender;
    private Race race;

    public Employee(Employee.Builder Build){
        this.empNumber = Build.empNumber;
        this.firstName = Build.firstName;
        this.surname = Build.surname;
        this.gender = Build.gender;
        this.race = Build.race;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    public Gender getGender(){
        return gender;
    }

    public Race getRace() {
        return race;
    }

    @Override
    public String toString() {
        return
                "Employee Number :'" + empNumber +
                "\nFirst Name      :" + firstName +
                "\nSurname         :" + surname +
                "\nGender          :" + gender.getGender()+
                "\nRace            :" + race.getRace()+
                "\nFrom Gender\n" + gender +
                "\nRace\n" +race;
    }

    public static class Builder{

        private String empNumber; //primary Key
        private String firstName;
        private String surname;
        private Gender gender;
        private Race race;

        public Builder empNumber(String empNumber){
            this.empNumber = empNumber;
            return this;
        }
        public Builder firstName(String fName){
            this.firstName = fName;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }
        public Builder race(Race race){
            this.race = race;
            return this;
        }

        public Employee Build(){
            return new Employee(this);
        }


    }
}
