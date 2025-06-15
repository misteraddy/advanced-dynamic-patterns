import java.util.Scanner ;

public class pattern4 {
    
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println();

        System.out.println("Enter the no. of rows");

        int n = sc.nextInt();

        System.out.println("Enter the no. of column");

        int m = sc.nextInt();

        for(int i = 0 ; i <= n ; i++) {

            for(int j = m ; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
