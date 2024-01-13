package Module2.SecondLesson;

public class Time {


    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public  Time nextSecond(){
        this.second++;
        if(this.second > 59){
            minute++;
            second = 0;
        }
        if (minute > 59) {
            hour++;
            minute = 0;
        }

        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

   public  Time previousSecond(){
        this.second--;
        if(this.second < 0){
            minute--;
            second = 59;
        }
        if (minute < 0) {
            hour--;
            minute = 59;
        }

        if (hour < 0) {
            hour = 23;
        }

        return this;
    }


    @Override
    public String toString() {
        String result = "";
        if (this.hour <= 9) {
            result += "0" + this.hour + ":";
        } else {
            result += this.hour + ":";
        }

        if (this.minute <= 9) {
            result += "0" + this.minute + ":";
        } else {
            result += this.minute + ":";
        }


        if (this.second <= 9) {
            result += "0" + this.second;
        } else {
            result += this.second;
        }

        return result;
    }
}
