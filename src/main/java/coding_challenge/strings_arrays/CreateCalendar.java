package coding_challenge.strings_arrays;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ryandesmond on 7/10/17.
 */


/*
    Write the code to create, parse modify and format a variety of dates and DateFormats.
 */
public class CreateCalendar {

    public static void main(String[] args) {

        // Create a Calendar object and set it's date to July 1, 2017.
        Calendar cal = Calendar.getInstance();
        cal.set(2017,07,01);

        // sout(date)
        System.out.println(cal);
        // Subtract 4 hours from Calendar


        // sout(date)

        // add 1 week to the date

        // sout(date)

        // demostrate modifying the format of the date at least two other ways,
        // (ie, "07-04-2017" or "Wed March 26 00:00:00 EST 2017")

        // sout(date)

    }
}
