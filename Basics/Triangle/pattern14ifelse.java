import java.util.Scanner ;

/*

Enter the number of rows
5
    *
   **
  ***
 ****
*****

 */

public class pattern14ifelse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {

                if(j <= n - i) {
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
