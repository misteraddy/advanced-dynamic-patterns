package com.example.demo.Basics;

import java.util.*;

/**
 * Input : 3
 *                     *
 *                    ***
 *                     *
 *                     *
 *                   *****
 *                     *
 *                     *
 *                     *
 *                  *******
 * Input :  4
 *                     *
 *                    ***
 *                     *
 *                     *
 *                   *****
 *                     *
 *                     *
 *                     *
 *                  *******
 *                     *
 *                     *
 *                     *
 *                     *
 *                 *********
 */
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for input
        int t = sc.nextInt(); // Reading the number of test cases
        while (t-- > 0) { // Loop for multiple test cases

            int n = sc.nextInt(); // Reading the size of the pattern

            String vt = "*"; // Vertical part of the pattern
            String ht = "***"; // Horizontal part of the pattern
            StringBuilder space = new StringBuilder(); // To handle spacing
            String d_space; // Stores the dynamically adjusted spaces

            space.append(" ".repeat(20)); // Initial space for alignment
            d_space = space.toString(); // Convert the StringBuilder to a String
            int k1 = 1; // Variable to track the line with horizontal stars
            int i = 0, j = 0; // Counters for the loop
            int f = 0; // Counter to track the number of horizontal star lines printed

            while (f < n) { // Loop to create the pattern for `n` levels

                if (i - j == k1) { // Condition to print the horizontal line
                    j = i; // Update `j` to track the current position
                    d_space = d_space.substring(1); // Reduce one space from the left
                    System.out.print(d_space); // Print the adjusted spaces

                    System.out.println(ht); // Print the horizontal stars
                    ht += "**"; // Add more stars for the next horizontal line
                    f++; // Increment the horizontal line counter
                    k1++; // Update `k1` to handle the next horizontal line
                }
                if (f < n) { // Ensure to print vertical lines only until `n` is reached
                    System.out.print(space); // Print the fixed spaces for alignment
                    System.out.println(vt); // Print the vertical star
                }

                i++; // Increment `i` for the next iteration
            }
        }
    }
}
