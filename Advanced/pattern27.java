package com.example.demo.Basics;
import java.util.Scanner;

/*
    
#webkul pattern program round 1 
# n=3
#     *
#   ***
#   @ @   
# ***@ @***
#  *     *


# n=5
#        *
#       ***          first part
#      *****     ----------------
#      @   @     
#      @   @     
#      @   @     
# *****@   @*****
#  ***       ***
#   *         *



 */

public class pattern27 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number : ");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i <= (n / 2) ; i++) {

            for(int j = 0 ; j < n ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j <= (n / 2) - i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 1 + 2*i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //second part
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 3 * n; j++) {
                if (j == n || j == 2 * n - 1) {
                    System.out.print("@");
                } else if (i == n - 2 && (j < n || j > 2 * n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }

        //third part
        for (int i = 0; i < n / 2; i++) {
            // First loop: Print spaces (i+1 times)
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            
            // Second loop: Print stars (n-2-2*i times)
            for (int j = 0; j < n - 2 - 2 * i; j++) {
                System.out.print("*");
            }
            
            // Third loop: Print spaces (i+1 times)
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            
            // Fourth loop: Print additional spaces (n times)
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            
            // Fifth loop: Print spaces (i+1 times)
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            
            // Sixth loop: Print stars (n-2-2*i times)
            for (int j = 0; j < n - 2 - 2 * i; j++) {
                System.out.print("*");
            }
            
            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
    
}
