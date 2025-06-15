package com.example.demo.Basics;
import java.util.Scanner;

/*
    
#webkul pattern program round 1 
#pattern runs for odd number like min 3 , 5, 7 etc
#here is ther pattern
#for n==3


*       *
**     **
***@@@***
   @@@
   @@@
   ***
    *


#for n==5 
*             *
**           **
***         ***
****       **** first part
*****@@@@@*****-------------------
     @@@@@
     @@@@@
     @@@@@      second part
     @@@@@     -------------------
     *****
      ***       third part
       *       -------------------

       
#and so on for n==7.....
#here is the program


 */

public class pattern26 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number : ");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i < n + 1 ; i++) {

            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }

            for(int j = 0 ; j < n - i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n ; j++) {
                if(i == n) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0 ; j < n - i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //second part
        for(int i = 0 ; i < n - 1 ; i++) {
            for(int j = 0 ; j < 2*n + n ; j++) {
                if(j < n || j > 2*n - 1) {
                    System.out.print(" ");
                }else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }

        //third part
        for (int i = 0; i <= n / 2; i++) {
            
            for(int j = 0 ; j < n ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n - 2*i ; j++) {
                System.out.print("*");
            }

            for(int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
    
}
