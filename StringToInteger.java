public class StringToInteger
{
    /**
     * Implementation of the "atoi" function to convert
     * a string to an integer.
     *
     * @param str the string to be converted.
     *
     * @return the integer from the string.
     */
    public int myAtoi(String str) {
        int result;

        while (str.length() > 0 && str.substring(0, 1).equals(" ")) str = str.substring(1);

        if (str.length() == 0) return 0;
        else {
            boolean isNegative;

            if (str.substring(0, 1).equals("-")) {
                isNegative = true;
                str = str.substring(1);
            }
            else if (str.substring(0, 1).equals("+")) {
                isNegative = false;
                str = str.substring(1);
            }
            else isNegative = false;

            if (str.length() == 0 || str.charAt(0) < '0' || str.charAt(0) > '9') return 0;

            int i = 0;

            while (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                i++;
            }

            str = str.substring(0, i);

            try {
                result = Integer.parseInt(str);
                if (isNegative) result = -result;
            }
            catch (NumberFormatException e) {
                if (isNegative) result = Integer.MIN_VALUE;
                else result = Integer.MAX_VALUE;
            }
        }

        return result;
    }
}
