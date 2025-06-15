package com.example.demo.Basics;
import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int t = sc.nextInt();
        while (t-- > 0)
        {

            int n  = sc.nextInt();
            if(n%2==0)
            {
                n++;
                System.out.println("Creating pattern for " + n + " as " + (n - 1) + "i s not acceptable ");
            }
            else
                System.out.println("Creating pattern for " + n);
                        String spaces = "";
            String st = "";
            for(int i = 0;i<n;i++) {
                spaces+=" ";
                st += "";
            }

              int g =-2;
             int spa = n+g;
             int ini_gaps = 0;

            for(int a =0 ;a<n;a++)
            {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < ini_gaps; j++)
                        System.out.print(spaces);

                    System.out.print(st);

                    if (a != n / 2) {
                        for (int s = 0; s < spa; s++)
                            System.out.print(spaces);

                        System.out.print(st);



                    }
                    if(a ==n/2)
                        g=2;
                    System.out.println();

                }

                spa += g;
                ini_gaps -= g / 2;


            }



        }

        sc.close();

    }

}
