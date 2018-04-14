package com.pro;

import java.util.Scanner;

public class Fibbi {
public static void main(String args[]){
	int n,a=0,b=0,c=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of n");
	n=s.nextInt();
	System.out.println("the number of fibbi series are");
	a=b;
	b=c;
	c=a+b;
	System.out.println("c=a+b");
}
}
