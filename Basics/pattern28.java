package com.example.demo.Basics;
import java.util.Scanner;

/*

# Input : 3
# Output : 
#                             @
#                            @@@
#                           @@@@@
#                           *   *
#                          **@@@**
#                           *   *
# Input : 5
# Output : 
#                             @
#                            @@@
#                           @@@@@     first part
#                          @@@@@@@  -----------------
#                          *     *
#                         **     **
#                        ***@@@@@***
#                         **     **   second part
#                          *     *  -----------------

 */


 public class pattern28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = sc.nextInt();

        // Top pyramid
        for (int i = 0; i < n / 2 + 2; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + 2 * i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Middle part with stars
        for (int i = 1; i < n / 2 + 1; i++) {
            if (i < n / 2 + 1) {
                for (int j = 0; j < n / 2 - i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Middle horizontal line
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n + 2 * (n / 2 + 1); j++) {
                if (j < n / 2 + 1 || j > n + n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }

        // Bottom inverted pyramids
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

