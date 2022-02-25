import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/*
Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
public class RegulaExp {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        boolean b = Pattern.matches("^[A-Z][^\\.]*.",sentence);
        System.out.println(b);
    }
}
