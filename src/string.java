 import java.util.*;
public class string {
    public static boolean isAnagram(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        } else {
//              str = str.toLowerCase();
//              str1 = str1.toLowerCase();
            char[] strarr = str.toCharArray();
            char[] str1arr = str1.toCharArray();

            Arrays.sort(strarr);
            Arrays.sort(str1arr);
            return Arrays.equals(strarr, str1arr);
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("race" , "case"));
    }
}
