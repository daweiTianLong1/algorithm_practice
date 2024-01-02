package minsubarraylen;

/**
 * @Description: 长度最小的子数组
 * @Author: PanYi
 * @Date: 2023/9/28
 */

public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int windowIndex = 0;
        int windowLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                windowLength = (i - windowIndex + 1);
                result = result < windowLength ? result : windowLength;
                sum -= nums[windowIndex++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        int i = minSubArrayLen.minSubArrayLen(4, new int[]{1,4,4});
        System.out.println(i);
    }

}
