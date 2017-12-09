package exam;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P5 {
    public static void main(String[] args) {

        Pattern P = Pattern.compile("[0-9]{3}[-]?[0-9]{4}");
        String haystack = "The Tommy Tutone song 867-5309 (Jenny) repeats Jenny’s phone number (8675309) 23 times !";
        Matcher M = P.matcher(haystack);
        while (M.find()) {
            System.out.format("[%d,%d]", M.start(), M.end());
        }

    }
}
