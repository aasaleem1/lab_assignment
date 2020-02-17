package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
        System.out.println("enter 2 numbers with a space in between");
        int n=sc.nextInt();
        int a=sc.nextInt();
        System.out.print("The sum of " + n+" and " +a+ " is "+(a+n)+".");

    }
}
