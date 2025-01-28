package com.example.demo.Basics;
import java.util.Scanner;

/*

Enter the number : 
5

@
@
@
@                         first part
@                      --------------------
@*****
     *****
         *****
             *****        second part
                 *****@--------------------
                      @
                      @
                      @
                      @   last part
                      @--------------------


 */

public class pattern21 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i < n ; i++) {

            System.out.println("@");
        }

        //second part
        for(int i = 0 ; i < n ; i++) {

            if(i == 0) {
                System.out.print("@");
                for(int j = 0 ; j < n ; j++) {
                    System.out.print("*");
                }
            } else {
                for(int j = 0 ; j < (i * (n - 1)) + 1 ; j++) {
                    System.out.print(" ");
                }

                for(int j = 0 ; j < n ; j++) {
                    System.out.print("*");
                }

                if(i == n - 1) System.out.print("@");
            }

            System.out.println();
        }

        // third part
        for(int i = 0 ; i < n ; i++) {

            for(int j = 0 ; j < ((n - 1) * (n - 1)) + 1 + n ; j++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }

        sc.close();

    }
}
