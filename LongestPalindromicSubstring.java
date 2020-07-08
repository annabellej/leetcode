import java.util.ArrayList;

public class LongestPalindromicSubstring
{
    /**
     * Finds the longest substring that is a palindrome.
     * Substring should be the same read backwards/forwards
     *
     * @param s the string to analyze
     *
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        else if (s.length() == 1) return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int evenLen = expandPalindrome(s, i, i + 1);
            int oddLen = expandPalindrome(s, i, i);

            int maxLen = Math.max(evenLen, oddLen);

            if (maxLen > end - start) {
                start = i - ((maxLen - 1) / 2);
                end = i + (maxLen / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Helper method for palindrome function. Expands the palidrome give a left/right index to check.
     *
     * @param s     the string containing the palindrome.
     * @param left  the left index to check.
     * @param right the right index to check.
     *
     * @return the length of the palindrome given these indices.
     */
    public int expandPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
