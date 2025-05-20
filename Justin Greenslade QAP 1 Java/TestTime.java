
public class TestTime {

    public static void main(String[] args) {

        //my default times
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // sets times using setTime
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // printed times before change
        System.out.println();
        System.out.println("Original Time");
        System.out.println("Time of T1 = " + t1.toString());
        System.out.println("Time of T2 = " + t2.toString());

        // changing times
        t1.nextSecond();
        t2.previousSecond();

        // re-diplaying times with new changes
        System.out.println();
        System.out.println("Updated Time");
        System.out.println("Time of T1 = " + t1.toString());
        System.out.println("Time of T2 = " + t2.toString());
        System.out.println();

    }
}