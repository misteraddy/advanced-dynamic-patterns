import java.util.Scanner;

/*

Enter the number of rows : 5
  X  
  X  
XXXXX
  X  
  X

 */

public class pattern9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {

                if(i == (n/2) + 1 || j == (n/2) + 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
