import java.util.Scanner;

/*

Enter the number of rows
5
*****
 ****
  ***
   **
    *

 */

public class pattern15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        //first way of printing this pattern 

        for(int i = 1 ; i <= n ; i++) {

            for(int j = 1 ; j < i ; j++) {
                System.out.print(" ");
            }

            for(int j = n ; j >= i ; j--) {
                System.out.print("*");
            }

            

            System.out.println();
        }

        sc.close();
    }
}
