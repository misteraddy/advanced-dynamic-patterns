import java.util.Scanner;

/*

Enter the number of rows
4
   *   
  ***
 *****
*******

 */

public class pattern16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j < 2*n ; j++) {

                if(j <= n - i || j >= n + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                
            }

            System.out.println();
        }

        sc.close();
    }
}
