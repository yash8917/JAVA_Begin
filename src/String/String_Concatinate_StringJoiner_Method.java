package String;

import java.util.StringJoiner;

public class String_Concatinate_StringJoiner_Method {
    public static void main(String[] args) {
        StringJoiner str=new StringJoiner(" , ");
        str.add("Hello");
        str.add("World");
        System.out.println(str.toString());
    }
}
