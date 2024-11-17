public class LongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int n = str.length();
        int start = 0, maxLength = 1;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = true;

                    if (length > maxLength) {
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }
        return str.substring(start, start + maxLength);
    }
    public static void main(String[] args) {
        String str1 = "forgeeksskeegfor";
        String str2 = "Geeks";
        String str3 = "abc";
        String str4 = "";
        System.out.println(longestPalindrome(str1));
        System.out.println(longestPalindrome(str2));
        System.out.println(longestPalindrome(str3));
        System.out.println(longestPalindrome(str4)); 
    }
}
