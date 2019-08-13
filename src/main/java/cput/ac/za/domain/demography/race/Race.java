package cput.ac.za.domain.demography.race;

public class Race {
    private int code;
    private String RaceType;

    public Race(Race.Builder Build){
        this.code = Build.code;
        this.RaceType = Build.RaceType;
    }

    public int getCode() {
        return code;
    }
    public String getRaceType() {
        return RaceType;
    }

    @Override
    public String toString() {
        return "Race{" +
                "code=" + code +
                ", RaceType='" + RaceType + '\'' +
                '}';
    }

    public static class Builder{
        private int code;
        private String RaceType;

        public Builder code(int code){
            this.code = code;
            return this;
        }
        public Builder RaceType(String RaceType){
            this.RaceType = RaceType;
            return this;
        }
        public Race Build(){
            return new Race(this);
        }
    }
}
