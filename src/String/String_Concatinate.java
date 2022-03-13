package String;

public class String_Concatinate {
    String s;
    String_Concatinate(){
         s="Hello Java";
    }
    public static void main(String[] args) {
        String_Concatinate st=new String_Concatinate();
       String str= st.s.concat(" programme");//if we concat without taking the another variable so it dosn't
        //concat because it holds the only Hello java , String is the immutable so we to create the
        // another object to hold the after concat String

        System.out.println(st.s);//it holds the only s data refrence which is store in String constant pool area..
        System.out.print("After concatinate the String:-> ");
        System.out.println(str);
    }
}
