package com.day;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Checkday {
public Checkday(int year, int month, Checkday day) {
		// TODO Auto-generated constructor stub
	}

public Checkday() {
	// TODO Auto-generated constructor stub
}

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter day(1-31)");
	int day=s.nextInt();
	System.out.println("ente month(1-12)");
	int month=s.nextInt();
	System.out.println("enter year(2001-2010)");
	int year=s.nextInt();
Date date=(new GergorianCalender(year,month,day));
 SimpleDateFormat f= new  SimpleDateFormat() ;
 String day1=f.format(day);
 System.out.println("thursday");
}

}
