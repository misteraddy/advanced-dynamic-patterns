import java.util.Scanner ;

/*

Enter the number of rows
5
*********
 ******* 
  *****  
   ***   
    *    

 */

public class pattern17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int n = sc.nextInt();

        int px = 1 ;

        int py = 2*n - 1 ;

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j < n*2 ; j++) {
                if(j >= px && j <= py) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            px++;
            py--;
            System.out.println();
        }
    }
    
}
