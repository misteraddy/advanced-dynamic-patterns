/*

A
BB
CCC
DDDD
EEEEE


 */

public class pattern12 {
    
    public static void main(String[] args) {

        System.out.println();

        for(char i = 'A' ; i <= 'E' ; i++) {

            for(char j = 'A' ; j <= i ; j++) {
                
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
