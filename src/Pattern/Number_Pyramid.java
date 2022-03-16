package Pattern;

import java.util.Scanner;

public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //print row no line
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter the no:
5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */