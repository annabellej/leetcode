import java.util.HashMap;

public class TwoSums {
    /**
     * Given an array and a target sum, find the two array indices that contain
     * the values adding up to the target sum.
     *
     * @param nums   the array of integers to go through.
     * @param target the target sum to identify.
     *
     * @return an array with two values that add up to the sum.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                result[0] = i;
                result[1] = (Integer) map.get(diff);
            }

            map.put(num, i);
        }

        return result;
    }
}
