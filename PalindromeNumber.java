public class PalindromeNumber
{
    /**
     * Determine whether a given integer is a palindrome.
     * Palindrome: a number that is read the same backwards or forwards.
     *
     * @param x the integer to analyze.
     *
     * @return true if the given int is a palindrome, else
     *         false if it is not a palindrome.
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;

        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;

        boolean result = true;

        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                result = false;
                break;
            }
            i++;
            j--;
        }

        return result;
    }

    public static void main(String[] args)
    {
        int x = 109238;
        System.out.println(isPalindrome(x));
    }
}
