package cput.ac.za.domain.demography.gender;

public class Gender {

    private int code;
    private String genderType;

    public Gender(Gender.Builder Build){
        this.code = Build.code;
        this.genderType = Build.genderType;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "code=" + code +
                ", genderType='" + genderType + '\'' +
                '}';
    }

    public String getGenderType() {
        return genderType;
    }

    public static class Builder{
        private int code;
        private String genderType;

        public Builder code(int code){
            this.code = code;
            return this;
        }
        public Builder genderType(String genderType){
            this.genderType = genderType;
            return this;
        }
        public Gender Build(){
            return new Gender(this);
        }
    }
}
