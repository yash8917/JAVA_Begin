import java.util.Scanner;

public class SumOf_First_n_naturalNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no that you want to sum:");
       int n= sc.nextInt();
        int s=0;
        for (int i = 0; i <=n; i++) {
            s+=i;
        }
        System.out.println("THe sum of the number's is:"+" "+s);
    }
}
