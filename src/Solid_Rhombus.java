import java.util.Scanner;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*  o/p->
Enter the no:
6
     * * * * * *
    * * * * * *
   * * * * * *
  * * * * * *
 * * * * * *
* * * * * *

 */