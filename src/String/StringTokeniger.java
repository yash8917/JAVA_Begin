package String;

import java.util.StringTokenizer;

public class StringTokeniger {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Harry");

        // printing next token
        //we can also use the hasMoreElements() This method returns the same value as hasMoreTokens()
        // method of StringTokenizer class. The only difference is this class can implement the Enumeration interface.
        while (st.hasMoreTokens())  {
            System.out.println(st.countTokens());//Calculates the number of times that
            // this tokenizer's nextToken method can be called before it generates an exception
            System.out.println(st.nextToken());//the next token from this string tokenizer.

        }

    }
}
