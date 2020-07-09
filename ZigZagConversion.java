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

        int numLetters = s.length();
        int numLines = 2 * (numLetters / (numRows + 1)) + 1;
        int curIndex = 0;

        char[][] arr = new char[numRows][numLines];

        for (int r = 0; r < numLines; r++) {
            if (r % 2 == 0 || numRows == 2) { //even row
                for (int c = 0; c < numRows; c++) {
                    if (curIndex >= numLetters) break;
                    arr[c][r] = s.charAt(curIndex);
                    curIndex++;
                }
            }
            else { //odd row
                for (int c = numRows - 2; c >= 1; c--) {
                    if (curIndex >= numLetters) break;
                    arr[c][r] = s.charAt(curIndex);
                    curIndex++;
                }
            }
            if (curIndex >= numLetters) break;
        }

        String result = "";

        for (int c = 0; c < numRows; c++) {
            for (int r = 0; r < numLines; r++) {
                char toAdd = arr[c][r];

                if (toAdd != '\u0000') result += toAdd;
            }
        }

        return result;
    }
}
