import java.util.regex.Pattern;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replace(" ", "");
        s = Pattern.compile("[^a-z0-9]").matcher(s).replaceAll("");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
