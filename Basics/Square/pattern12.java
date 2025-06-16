import java.util.Scanner;

/*

Enter the number of rows
5

*****
*   *
*   *
*   *
*****

 */

public class pattern12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                
                if(i == n || j == n || j == 1 || i == 1) {
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
