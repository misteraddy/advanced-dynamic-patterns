import java.util.Scanner;

/*

Enter the rows
5

11111
2222 
333  
44   
5    
     
54321
5432 
543  
54   
5    
     
55555
4444 
333  
22   
1


54321
5432 
543  
54   
5    
     
*****
**** 
***  
**
*


 */

public class pattern13 {
    public static void main(String[] args) {

        System.out.println();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");

        int n = sc.nextInt();

        //first pattern

        for(int i = 1 ; i <= n ; i++) {

            for(int j = n ; j >= i ; j--) {
                System.out.print(i);
            }

            System.out.println();

        }

        System.out.println();

        //second pattern

        for(int i = 1 ; i <= n ; i++) {

            for(int j = n ; j >= i ; j--) {
                System.out.print(j);
            }

            System.out.println();

        }

        System.out.println();

        //third pattern

        for(int i = 1 ; i <= n ; i++) {

            for(int j = n ; j >= i ; j--) {
                System.out.print(n - i + 1);
            }

            System.out.println();

        }

        //fourth pattern

        for(int i = 1 ; i <= n ; i++) {

            for(int j = n ; j >= i ; j--) {
                System.out.print(j);
            }

            System.out.println();

        }

        System.out.println();
        
        //fifth pattern

        for(int i = 1 ; i <= n ; i++) {

            for(int j = n ; j >= i ; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();
    }
}
