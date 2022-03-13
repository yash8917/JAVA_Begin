package String;

public class Equla_Operator {
    public static void main(String[] args) {
        String s1="Suresh";
        String s2="Suresh";
        String s3=new String("Raina");
        String s4="Suresh";
        System.out.println(s1 == s2);//return the true coz both refer the same instance
        System.out.println(s1 == s3); //return the false coz s3 refers to instance created in non-pool area
    }
}
