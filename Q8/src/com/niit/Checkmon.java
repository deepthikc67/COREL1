package com.niit;
import java.util.Scanner;
public class Checkmon {
	void display()
	{
		System.out.println("january");
	}

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter day(1-31)");
		int dd=s.nextInt();
		System.out.println("ente month(1-12)");
		int mm=s.nextInt();
		System.out.println("enter year(2001-2010)");
		int yyyy=s.nextInt();
	 Checkmon m= new Checkmon();
		Scanner f=new Scanner(System.in);
	m.display();
	
	}

	}

