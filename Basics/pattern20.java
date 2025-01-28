package com.example.demo.Basics;
import java.util.Scanner;

/*

Enter the number
3

@***
@  ***    first part
@    ***@--------------
@       @--------------- second part
@       @
@       @ third part
@       @---------------

 */

public class pattern20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i < n ; i++) {

            System.out.print("@");

            for(int j = 0 ; j < i*(n - 1) ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n ; j++) {
                System.out.print("*");
            }

            if(i == n - 1) System.out.print("@");

            System.out.println();

        }

        //second part
        for(int i = 0 ; i < 1 ; i++) {
            System.out.print("@");
            for(int j = 0 ; j < ((n - 1) * (n - 1) ) + n ; j++) {
                System.out.print(" ");
            }

            System.out.print("@");

            System.out.println();
        }

        //third part
        for(int i = 0 ; i < n ; i++) {

            for(int j = 0 ; j < ((n - 1) * (n - 1) ) + n + 2 ; j++) {
                if(j == 0 || j == ((n - 1) * (n - 1) ) + n + 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        sc.close();
    }
    
}
