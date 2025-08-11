import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
	    
	    int year = utcNow.getYear();
	    int month = utcNow.getMonthValue();
	    int day = utcNow.getDayOfMonth();
	    
	    System.out.printf("%d\n%02d\n%02d",year, month, day);
	}
}