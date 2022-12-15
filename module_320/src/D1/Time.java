package D1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String stringHour;
        String stringMinute;
        String stringSecond;

        if (hour <= 9){
            stringHour = "0" + String.valueOf(hour);
        }else{
            stringHour = String.valueOf(hour);
        }

        if (minute <= 9){
            stringMinute = "0" + String.valueOf(minute);
        }else{
            stringMinute = String.valueOf(minute);
        }

        if (second <= 9){
            stringSecond = "0" + String.valueOf(second);
        }else{
            stringSecond = String.valueOf(second);
        }
        return stringHour + ":" + stringMinute + ":" + stringSecond;
    }

    public void setTime(int second, int minute, int hour){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }else {
            throw new IllegalArgumentException("Invalide Hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }else {
            throw new IllegalArgumentException("Invalide Minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59){
            this.second = second;
        }else {
            throw new IllegalArgumentException("Invalide Second!");
        }
    }

    public Object nextSecond(){

        if (second >= 59){
            second = 0;
            if (minute >= 59){
                minute = 0;
                hour++;
            }else{
                minute++;
            }
        }else{
            second++;
        }

        return this;
    }
}
