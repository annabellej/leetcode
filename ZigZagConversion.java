public class ZigZagConversion
{
    /**
     * Give a string and number of rows, rewrite the string in a zig zag pattern and print the new
     * order of letters.
     * Assumption: numRows is not negative
     *
     * @param s       the string to analyze.
     * @param numRows the number of rows for the zig zag.
     *
     * @return the reordered string.
     */
    public String convert(String s, int numRows) {
        if (numRows == 0) return "";
        else if (numRows == 1) return s;

        String result = "";

        int numLetters = s.length();

        //first row:
        int i = 0;
        while (i < numLetters) {
            result += s.charAt(i);
            i += (numRows - 1) * 2;
        }

        //middle rows:
        for (int curRow = 1; curRow < numRows - 1; curRow++) {
            i = curRow;
            while (i < numLetters) {
                result += s.charAt(i);
                int j = i + (numRows * 2) - 2 - (curRow * 2);

                if (j < numLetters) {
                    result += s.charAt(j);
                }
                i += (numRows * 2) - 2;
            }
        }

        //last row:
        i = numRows - 1;
        while (i < numLetters) {
            result += s.charAt(i);
            i += (numRows - 1) * 2;
        }

        return result;
    }
}
