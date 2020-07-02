public class MedianOfTwoSortedArrays
{
    /**
     * Finds the median value of two sorted arrays.
     * The given arrays cannot both be empty.
     *
     * @param nums1 the first array
     * @param nums2 the second array
     *
     * @return the median of the given sorted arrays.
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int maxLen = Math.max(len1, len2);

        int[] allNums = new int[len1 + len2];
        int allNumsIndex = 0;

        int i = 0;
        int j = 0;

        while (i < len1 || j < len2) {
            int num1 = Integer.MAX_VALUE;
            int num2 = Integer.MAX_VALUE;

            if (i < len1) num1 = nums1[i];
            if (j < len2) num2 = nums2[j];

            if (num1 < num2) {
                allNums[allNumsIndex] = num1;
                allNumsIndex++;

                i++;
            }
            else {
                allNums[allNumsIndex] = num2;
                allNumsIndex++;

                j++;
            }
        }

        i = 0;
        j = allNums.length - 1;

        while (j > i) {
            i++;
            j--;
        }

        return (allNums[i] + allNums[j]) / 2.0;
    }
}
