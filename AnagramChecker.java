import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
        String s3 = "allergy";
        String s4 = "allergic";
        System.out.println(areAnagrams(s3, s4));
        String s5 = "g";
        String s6 = "g";
        System.out.println(areAnagrams(s5, s6));
    }
}
