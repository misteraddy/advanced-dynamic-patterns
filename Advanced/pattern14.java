package com.example.demo.Basics;
import java.util.Scanner ;

/*

 Enter the number : 
6
*****
*     
*     
*     
* ****
**** *

 */

public class pattern14 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = sc.nextInt();

        for(int i = 0 ; i < 1 ; i++) {
            for(int j = 0 ; j < n - 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 0 ; i < n/2 ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(j == 0 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 0 ; i < 1 ; i++) {

            for(int j = 0 ; j < n ; j++) {
                if(j != 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(int i = 0 ; i < 1 ; i++) {

            for(int j = 0 ; j < n ; j++) {
                if(j != n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();

    }
}
