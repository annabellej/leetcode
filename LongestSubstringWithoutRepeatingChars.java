import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars
{
    /**
     * Finds the length of the longest substring without any repeating characters.
     *
     * @param s the string the be analyzed.
     *
     * @return the length of the longest non-repeating substring.
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(" ")) return 1;
        else if(s.equals("")) return 0;

        int longest = 1;
        HashSet<Character> set = new HashSet<Character>();
        char[] letters = s.toCharArray();
        int slen = letters.length;
        int headPoint = 0;

        for (int i = 0; i < slen; i++)
        {
            char curChar = letters[i];

            if (set.contains(curChar)) {
                set.remove(letters[headPoint]);
                headPoint++;
                i--;
            }
            else {
                set.add(curChar);
                longest = Math.max(longest, set.size());
            }
        }

        return longest;
    }
}
