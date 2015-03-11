/**
 * Created by student on 11.03.2015.
 */
public class TestMyTime {
    public static void main(String[] args) {


        MyTime t1 = new MyTime(22, 23, 23);
        System.out.println(t1);
        System.out.println(t1.nextMinute());
        System.out.println(t1.previousHour());

    }
}