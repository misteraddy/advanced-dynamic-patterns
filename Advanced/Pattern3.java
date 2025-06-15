package com.example.demo.Basics;

import java.util.Scanner;

/*
 Enter the number: 5
 
  *******
  *     *
  *     *
  *     * part 1
  ******* ------------
  e     e
  e     e
  e     e
  e     e part2
  e     e--------------
***** *****
 ***   ***  part 3
  *     * ------------- 

 */

public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //first part
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces for the pattern
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || j == 0 || j == n + 1 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next line
        }

        //second part
        for(int i = 0 ; i < n ; i++) {

             // Print leading spaces
             for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n + 2 ; j++) {
                if(j == 0 || j == n + 1) {
                    System.out.print("e");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //part three
        for(int i = 0 ; i < n/2 + 1 ; i++) {

            for(int j = 0 ; j < 2*n + 1 ; j++) {
                
                if(j >= i && j <= n - i - 1 || j >= n + i + 1 && j <= 2*n - i) {
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
