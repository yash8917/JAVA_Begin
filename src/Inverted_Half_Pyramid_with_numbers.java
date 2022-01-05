import java.util.Scanner;

public class Inverted_Half_Pyramid_with_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of row's:");
        int n = sc.nextInt();
        //Outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= n-i+1; j++) {
                //print the number's i.e 1 to 5 countinuous
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}