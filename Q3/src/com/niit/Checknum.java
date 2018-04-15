package com.niit;

public class Checknum {


public static class Main {
	 
static int i;

    public static int difference(final int... array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The input array is empty.");
        }

        int max = array[0];
        int min = array[0];

        for (final int i : array) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }

        return max - min;   
    }

	 public static void main(final String[] args) {
	
		System.out.println(difference(2 ,3 ,4 ,2, 3) );
    }
}}