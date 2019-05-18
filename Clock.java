package clocks;
/**
 * This is a clock that shows local time.
 *
 * @author (TMR)
 * @version (9/17)
 */
import java.util.*; //To use the GregorianCalendar class
import java.text.*;
public class Clock implements IClock
{
    private int second; //current time in hrs, mins and seconds
    private int minute;
    private int hour;

    public Clock()
    {
        // The clock gets current time from the GregorianCalendar class
        GregorianCalendar date = new GregorianCalendar();
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour   = date.get(Calendar.HOUR);
    }

    @Override
    public int getHour() {
        return  hour;
    }

    @Override
    public int getMinute() {
        return minute;
    }

    @Override
    public int getSecond() {
        return second;
    }
    // Write the getHour, getMinute and getSecond methods

}
