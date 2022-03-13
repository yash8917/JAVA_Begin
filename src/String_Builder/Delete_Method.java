package String_Builder;

public class Delete_Method {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        str.delete(2,4);
        System.out.println(str);
    }
}
