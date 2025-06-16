import java.util.Scanner;

/*

Enter the number of rows
5

X____
_X___
__X__
___X_
____X

 */

public class pattern10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {

                if(i == j) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
