public class MaxOfThe_Array {
    int[] arr;
    public int max(int[] arr) {
        int maxval = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        int[] arr={12,334,34,5,5,767};
        MaxOfThe_Array obj=new MaxOfThe_Array();
        System.out.println("The maximum of the array is:-"+obj.max(arr));
    }
}
