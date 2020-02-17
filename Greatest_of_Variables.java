package com.company;

import java.util.Scanner;

public class Greatest_of_Variables {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any 3 whole numbers with a space in between");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if (b>a) max= b;
        if (c>max) max= c;
        System.out.print("The maximum of the 3 numbers is " +max+".");

    }
}
