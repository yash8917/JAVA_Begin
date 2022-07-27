public class Print_Array_Method {
    static  void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{34, 24, 34, 54, 56});
    }
}
