package Pattern;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solid_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of Rows:");
        int n= sc.nextInt();
        System.out.println("Enter the no. of Column:");
        int c= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=c;j++){//this  concept is known as nested loop's
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
