package String;
//equals method returns the boolean value and compare the another value to specific String..

public class Equals_Method {
    public static void main(String[] args) {
        String s1="Suresh";
        String s2="Suresh";
        String s3=new String("Raina");
        String s4="Suresh";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s1.equals(s3));
    }
}
