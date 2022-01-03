import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int i= sc.nextInt();
        System.out.println("Enter the second Number:");
        int j=sc.nextInt();
        int s=i+j;
        System.out.println("The sum of two Numbers is:"+" "+s);
    }
}