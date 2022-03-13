package String;

public class CapacityMethod {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder();
        System.out.println(st.capacity());
        st.append("Hello idn");
        System.out.println(st.capacity());
        st.append("java is there");
        System.out.println(st.capacity());
    }
}
//Output->
/*
16
16
34
*/