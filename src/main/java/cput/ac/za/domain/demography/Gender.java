package cput.ac.za.domain.demography;

public class Gender {

    private String id;
    private String gender;

    public Gender(Builder Build){
        this.id = Build.id;
        this.gender = Build.gender;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "ID      :" + getId()+
                "\nGender  :" + getGender();
    }

    public static class Builder{
        private String id;
        private String gender;

        public Builder id(String id){
            this.id = id;
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
