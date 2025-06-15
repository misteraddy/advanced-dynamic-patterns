import java.util.Scanner ;

/*

Enter the number of rows
5
    *
   **
  ***
 ****
*****

Pattern 2 is here

    *
   * *
  * * *
 * * * *
* * * * *

 */

public class pattern14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = n - 1 ; j >= i ; j--) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Pattern 2 is here ");

        for(int i = 1 ; i <= n ; i++) {
            for(int j = n - 1 ; j >= i ; j--) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
    
}
