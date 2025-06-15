package com.example.demo.Basics;
import java.util.Scanner ;

/*

Enter the number
5
eeee     *
   *     *     *
   *     *     *
   *eeeee*eeeee*
   *     *     *
   *     *     *
         *     eeeee

 */

public class pattern8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        for(int i = 0 ; i < 1 ; i++) {
            for(int j = 0 ; j < n - 1 ; j++) {
                System.out.print("e");
            }

            for(int j = 0 ; j < n ; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        
        }

        //second part 
        for(int i = 0 ; i < 5 ; i++) {

            for(int j = 0 ; j < n/2 + 1 ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 1 ; j++) {
                System.out.print("*");
            }

            for(int j = 0 ; j < n ; j++) {
                if(i == n/2) {
                    System.out.print("e");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0 ; j < 1 ; j++) {
                System.out.print("*");
            }

            for(int j = 0 ; j < n ; j++) {
                if(i == n/2) {
                    System.out.print("e");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0 ; j < 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 0 ; i < 1 ; i++) {
            for(int j = 0 ; j < 2*n - 1 ; j++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j < 1 ; j++) {
                System.out.print("*");
            }

            for(int j = 0 ; j < n ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n ; j++) {
                System.out.print("e");
            }

            System.out.println();
        }


        sc.close();
    }
}
