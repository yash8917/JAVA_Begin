package Arrays;

import java.util.Arrays;

public class Avg_ofTheArray {
    public static void main(String[] args) {
        int a[]=new int [5];
        a= new int[]{10, 20, 30, 40, 50};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        System.out.println(Arrays.toString(a));
        //CAlculate the average of array
        float sum=0;
        float avg;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        avg=sum / a.length;
        System.out.println("The Average of the Array is: "+avg);
    }
}
