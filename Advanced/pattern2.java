package com.example.demo.Basics;
import java.util.Scanner;


/*
    Enter the number : 5
     *
    ***
   *****
     @
     @
     @
     @
     @
  *******
  *     *
  *     *
  *     *
  *     *
***** *****
 ***   *** 
  *     *  

 */

public class pattern2 {
    
    public static void main(String[] args) {

        int n ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        n = sc.nextInt();

        for(int i = 0 ; i < n/2 + 1 ; i++) {

            for(int j = 0 ; j < n - i ; j++) {

                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i + 1 ; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 0 ; i < n ; i++) {
            
            for(int j = 0 ; j < n ; j++) {
                    System.out.print(" ");
            }

            System.err.println("@");
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n/2 ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n + 2 ; j++) {
                if(i == 0 || j == 0 || j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(int i = 0 ; i < n/2 + 1 ; i++) {

            for(int j= 0 ; j < n*2 + 1 ; j++) {
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
