package com.example.demo.Basics;
import java.util.Scanner;

//error program this is 16

public class pattern15 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        for(int i = 0 ; i < n - 1 ; i++) {
            for(int j = 0 ; j < n + 2 ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0 ; i < 1 ; i++) {
            for(int j = 0 ; j < n + 2 ; j++) {
                System.out.print("@");
            }

            for(int j = 0 ; j < n + 2 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for(int i = 0 ; i < n - 1 ; i++) {

            for(int j = 0 ; j < n + 3 + i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j < n - 2*i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}
