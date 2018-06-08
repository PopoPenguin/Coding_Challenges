package coding_challenge.strings_arrays;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;

import java.text.SimpleDateFormat;
import java.util.*;

/*
    Write the code to create, parse modify and format a variety of dates and DateFormats.
 */
public class CreateCalendar {

    public static void main(String[] args) {

        // Create a Calendar object and set it's date to July 1, 2017.
        Calendar cal = Calendar.getInstance();
        cal.set(2017,Calendar.JULY,01);

        // sout(date)
        System.out.println("initial date = " + cal.getTime());

        // Subtract 4 hours from Calendar
        cal.add(Calendar.HOUR, -4);

        // sout(date)
        System.out.println("adjusted time - 4 hours = " + cal.getTime());

        // add 1 week to the date
        cal.add(Calendar.WEEK_OF_YEAR, +1);

        // sout(date)
        System.out.println("adjusted time + 1 week = " + cal.getTime());

        // demostrate modifying the format of the date at least two other ways,
        // (ie, "07-04-2017" or "Wed March 26 00:00:00 EST 2017")
        // sout(date)

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM hh:mm a");
        System.out.println("adjusted format in year/day/month in standard time = " + dateFormat.format(cal.getTime()));
        dateFormat = new SimpleDateFormat("E MM-dd-yy HH:mm");
        System.out.println("adjusted format in day of week month-day-year military time = " + dateFormat.format(cal.getTime()));

    }
}
