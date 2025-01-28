package com.example.demo.Basics;
import java.util.Scanner ;

/*
 
Enter the number
5
       *
      ***  first part
     ***** ---------
     *   *
     *   * second part
     *   * ---------
*****     *****
 ***       *** 
  *         *  


 */

public class pattern5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i < n/2 + 1 ; i++) {

            for(int j = 0 ; j < n + 2 - i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //second part
        for(int i = 0 ; i < n/2 + 1 ; i++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n ; j++) {
                if(j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //third part
        for(int i = 0 ; i < n/2 + 1 ; i++) {
            for(int j = 0 ; j < 2*n + n ; j++) {
                if(j >= i && j <= n - i - 1 || j >= 2*n + i && j < 2*n + n - i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
