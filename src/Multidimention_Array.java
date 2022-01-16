import java.util.ArrayList;
import java.util.Scanner;

public class Multidimention_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> obj=new ArrayList<>();

        //Initialization
        for (int i = 0; i < 3; i++) {
            obj.add(new ArrayList<>());
        }
        //Add Element
        System.out.println("Enter the elements:");
        //the size of te array is 3*3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                obj.get(i).add(sc.nextInt());
            }
        }
        System.out.println(obj);
    }
}
