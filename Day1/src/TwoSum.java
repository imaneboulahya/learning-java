/**
 * Returns the indices of the two numbers in the array that add up to the given target.
 *
 * <p>You may assume that each input has exactly one solution,
 * and you may not use the same element twice.</p>
 *
 * <p>The answer can be returned in any order.</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 * </pre>
 *
 * @param nums an array of integers
 * @param target the target sum
 * @return an array containing the indices of the two numbers
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}