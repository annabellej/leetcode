public class ReverseInteger
{
    /**
     * Reverses the digits of a given integer.
     *
     * @param x the integer to be reversed.
     *
     * @return the reversed integer.
     */
    public int reverse(int x) {
        boolean isNeg = x < 0;
        x = Math.abs(x);
        String resultSTR = "";

        if (x == 0) return 0;

        while (x > 0) {
            resultSTR += (x % 10);
            x /= 10;
        }

        int result;

        try {
            result = Integer.parseInt(resultSTR);
        }
        catch (RuntimeException e) {
            result = 0;
        }

        if (isNeg) result = -result;
        return result;
    }
}
