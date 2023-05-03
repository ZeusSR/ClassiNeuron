package in.DateTimeApi;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
public class LaunchMain {

	public static void main(String[] args) {


	/*	Before JDK 1.8
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		
		long d = utilDate.getHours();
		System.out.println(d);
		
		long e = utilDate.getTime();
		System.out.println(e);
		
		java.sql.Date sqldate = new java.sql.Date(d);
		System.out.println(sqldate);
		
		java.sql.Date sql1date = new java.sql.Date(e);
		System.out.println(sql1date); */
		
		
		 LocalDate date =  LocalDate.now();
		 
		 System.out.println(date);
		 
		 int dd = date.getDayOfMonth();
		 int mm = date.getMonthValue();
		 int yy = date.getDayOfYear();
		 IsoChronology tt = date.getChronology();
	
		 System.out.println(dd);
		 System.out.println(mm);
		 System.out.println(yy);
		 System.out.println(tt);
		 
		 System.out.println();
		 
		 LocalTime time = LocalTime.now();
		 
		 System.out.println(time);
		 
		 int hh = time.getHour();
		 int mim = time.getMinute();
		 int s = time.getSecond();
		 int ns = time.getNano();
		
		 System.out.println(hh);
		 System.out.println(mim);
		 System.out.println(s);
		 System.out.println(ns);
		 
		 System.out.println();
		 
		 LocalDateTime dt = LocalDateTime.now();
		 
		 System.out.println(dt);
		 
		  Chronology ldc = dt.getChronology();
		  String k   = dt.toString();
		  int x =dt.getYear();        
	
		  LocalDateTime ki = dt.minusYears(28);
		  System.out.println(ldc);
		  System.out.println(k+"  "+x+" "+ki);
		
			  System.out.println();
		  
		  LocalDateTime mt = LocalDateTime.of(2021,11,9,23,12,45);
		  
		  System.out.println(mt);
		  
		  System.out.println(mt.minusMonths(1));
		  System.out.println(mt.plusMonths(1));
		  System.out.println(mt.minusMonths(4));
		
		  ZoneId zone = ZoneId.systemDefault();
		  ZonedDateTime z = ZonedDateTime.now(); 
		  System.out.println(zone);
		  System.out.println(z);
		  
	}

}
