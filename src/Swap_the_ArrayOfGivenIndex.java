import java.util.Arrays;

public class Swap_the_ArrayOfGivenIndex {
    public void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    int[] arr;
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Swap_the_ArrayOfGivenIndex obj=new Swap_the_ArrayOfGivenIndex();
        System.out.println("Before swaping Array is: "+Arrays.toString(arr));
        obj.swap(arr,3,1);
        System.out.println("After Swaping Array is: "+Arrays.toString(arr));
    }
}
