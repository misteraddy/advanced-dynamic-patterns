package com.example.demo.Basics;

/*

 
Enter the number : 
5

@          
@@         @@@@@
@@@        @@@@@   first part
@@@@*******@@@@@------------------------
@@@        @@@@@
@@         @@@@@   second part
@               ------------------------


 */


public class pattern25 {

    public static void main(String[] args) {
        int n = 5;

        // first part
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < n - 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n + 2; j++) {
                if (i == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // second part
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 + 1 - i; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n + 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i < n / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        
    }
    
}
