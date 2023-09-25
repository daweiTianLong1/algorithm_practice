package sortedsquares;

import java.util.Arrays;

/**
 * @Description:
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        while (left < right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[right - left] = nums[left] * nums[left];
                left ++;
            } else {
                result[right - left] = nums[right] * nums[right];
                right --;
            }
        }
        return result;
    }

    // 编写测试用例
    public static void main(String[] args) {
        int[] a = new int[]{-4,-1,0,3,10};
        SortedSquares sortedSquares = new SortedSquares();
        int[] ints = sortedSquares.sortedSquares(a);
        System.out.println(Arrays.toString(ints));
    }
}
