package strings;

import java.util.Arrays;

public class anagram {

    public static boolean isAnagram(String s1, String s2) {

        // 1. Length check (cheap & necessary)
        if (s1.length() != s2.length()) {
            return false;
        }

        // 2. Convert to char arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // 3. Sort both
        Arrays.sort(a);
        Arrays.sort(b);

        // 4. Compare
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
