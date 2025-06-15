package com.example.demo.Basics;
import java.util.Scanner;

/*
Enter the number : 
5
  *@@@@@@     @@@@@@*
 **     @     @     **
***     @     @     ***
 **     @     @     **    first part
  *     *******     *  ---------------------
         *****      
          ***             second part
           *           ---------------------    

 */

public class pattern17 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = sc.nextInt();
        
        //first part
        for(int i = 0 ; i < 2*n - 1 ; i++) {
            for(int j = 0 ; j < n/2 + 1 ; j++) {
                if(j >= n/2 - i && j >= i - n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0 ; j < n ; j++) {
                if(i == 0) {
                    System.out.print("@");
                }
                else {
                    System.out.print(" ");
                }
            }


            for(int j = 0 ; j < n ; j++) {
                    if(j == 0 && i != n - 1 || j == n - 1 && i != n - 1) {
                        System.out.print("@");
                    }else if (i == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            for(int j = 0 ; j < n/2 + 1 ; j++) {
                if(j >= n/2 - i && j >= i - n/2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //second part
        for(int i = 0 ; i < n/2 + 1 ; i++) {
            for(int j = 0 ; j < n + n/2 + 1 ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n - 2*i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        

        sc.close();
    }
}
