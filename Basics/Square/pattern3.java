import java.util.Scanner;

/*
 Enter the no. of rows
5
Enter the no. of column
5
555555
444444
333333
222222
111111
 */

public class pattern3 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.println();

        System.out.println("Enter the no. of rows");

        int n = sc.nextInt();

        System.out.println("Enter the no. of column");

        int m = sc.nextInt();

        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 0 ; j <=n ; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
