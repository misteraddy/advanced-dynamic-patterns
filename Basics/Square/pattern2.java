import java.util.*;

public class pattern2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows");

        int n = sc.nextInt();

        System.out.println("Enter the no. of column");

        int m = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <=m ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
