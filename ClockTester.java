package clocks;

public class ClockTester {

    public static void main (String [] args){

        Clock clock = new Clock();


        int h = clock.getHour();
        int m = clock.getMinute();
        int s = clock.getSecond();

        System.out.printf("%d hours: %d minutes : %d seconds", h, m, s);
    }

}
