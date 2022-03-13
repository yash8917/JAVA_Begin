package Arrays;

public class MaxOfTheArray_OfGivenLimit {
    int[] arr;

    public int maxofLimit(int[] arr, int start, int end) {
        int maxval = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    public static void main(String[] args) {
        int[] arr = {12, 334, 34, 5, 5, 767};
        MaxOfTheArray_OfGivenLimit obj = new MaxOfTheArray_OfGivenLimit();
        System.out.print("The max of te Given Limit is: "+obj.maxofLimit(arr, 2, 4));
    }
}
