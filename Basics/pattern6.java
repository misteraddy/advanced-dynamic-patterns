package com.example.demo.Basics;
import java.util.Scanner ;

/*

Enter the number
5
     *
    ***  first part
   ***** --------
   *   *
   *   *
   *   *
   *   * second part
   *   * ---------
  *     *
 **     **
***     ***
 **     ** third part
  *     * ---------


 */

public class pattern6 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        //first part
        for(int i = 0 ; i < n/2 + 1 ; i++) {

            for(int j = 0 ; j < n - i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //second part
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n / 2 + 1 ; j++) {
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
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n/2 + 1 ; j++ ) {
                if(j >= i - n / 2 && j >= n/2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j =0 ; j < n ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n/2 + 1 ; j++ ) {
                if(j >= i - n / 2 && j >= n/2 - i) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }

        sc.close();
    }
}
