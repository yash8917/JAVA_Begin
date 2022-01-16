import java.util.Scanner;

public class Array_2D_Input_Output {
    static int[][] arr=new int[3][3];//row is mandatory to mention
    Array_2D_Input_Output(){
        Scanner s =new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = s.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Array_2D_Input_Output obj=new Array_2D_Input_Output();
        // to print the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
