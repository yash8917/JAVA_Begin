package Pattern;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of row's:");
        int n = sc.nextInt();
        //Outer loop
        int num = 1;
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                //print the number's i.e 1 to 5 countinuous
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}