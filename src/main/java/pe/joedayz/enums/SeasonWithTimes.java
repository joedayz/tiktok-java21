package pe.joedayz.enums;

public enum SeasonWithTimes {

    WINTER{
        @Override
        public String getHours() {
            return "10:00 AM - 3:00 PM";
        }
    },
    SUMMER{
        @Override
        public String getHours() {
            return "9:00 aM - 7:00 PM";
        }
    },
    FALL, SPRING;

    public  String getHours(){
        return "9am - 5pm";
    }













}
