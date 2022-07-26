import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max = 0;
        if (max < x ){
            max=x;
        }
        if (max < y){
            max=y;
        }
        if (max < z){
            max=z;
        }
        System.out.println("greater no is :"+max);
    }
}
