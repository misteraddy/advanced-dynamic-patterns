import java.util.Scanner;

/*

Enter the number of rows
5
*   *
 * *
  *
 * *
*   *

 */

public class pattern11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {

                if(i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();

    }
}
