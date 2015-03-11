/**
 * Created by student on 11.03.2015.
 */
public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime(int hour, int minute, int second) {
        if (hour<=23 && hour>=0) {
            this.hour = hour;
        }
        else
        {
            throw new IllegalArgumentException("Invalid hour!");
        }
        if (minute<=59 && minute>=0) {
            this.minute = minute;
        }
        else
        {
            throw new IllegalArgumentException("Invalid minute!");
        }
        if (second<=59 && second>=0) {
            this.second = second;
        }
        else
        {
            throw new IllegalArgumentException("Invalid second!");
        }


    }

    public void setHour(int hour) {
        if (hour<=23 && hour>=0) {
            this.hour = hour;
        }
        else
        {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (minute<=59 && minute>=0) {
            this.minute = minute;
        }
        else
        {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (second<=59 && second>=0) {
            this.second = second;
        }
        else
        {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    @Override
    public String toString() {
        return
                 hour +":"+
                 minute +":"+
                second;
    }

    public MyTime nextSecond () {

        int second = this.second;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.second == 59) {
            t1 = t1.nextMinute();
        } else {
            second++;
            t1 = new MyTime(hour, minute, second);

        }
        return t1;
    }

    public MyTime nextMinute () {

        int minute = this.minute;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.minute == 59) {
            t1 = t1.nextHour();
            t1.setMinute(0);
        } else {
            minute++;
            t1 = new MyTime(hour, minute, second);
        }
        return t1;
    }
    public MyTime nextHour () {

        int hour = this.hour;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.hour == 23) {
            t1.setHour(0);
        } else {
            hour++;
        }
        return t1;
    }


    public MyTime previousHour() {
        int hour = this.hour;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.hour == 0) {
            t1.setHour(23);
        } else {
            hour--;
            t1 = new MyTime(hour, minute, second);

        }
        return t1;

    }
    public MyTime previousMinute () {

        int minute = this.minute;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.minute == 0) {
            t1 = t1.previousHour();
            t1.setMinute(59);
        } else {
            minute--;
            t1 = new MyTime(hour, minute, second);
        }
        return t1;
    }

    public MyTime previousSecond () {

        int minute = this.minute;
        MyTime t1 = new MyTime(this.hour, this.minute, this.second);
        if (this.second == 0) {
            t1 = t1.previousMinute();
            t1.setSecond(59);
        } else {
            second--;
            t1 = new MyTime(hour, minute, second);
        }
        return t1;
    }



}




