package sortedsquares;

import java.util.Arrays;

/**
 * @Description:
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int size = nums.length;
        int preIndex = 0;
        int afterIndex = size - 1;
        int[] newSortedSquares = new int[size];

        while (preIndex <= afterIndex) {
            if (nums[preIndex] * nums[preIndex] >= nums[afterIndex] * nums[afterIndex]) {
                newSortedSquares[--size] = nums[preIndex] * nums[preIndex];
                preIndex++;
            } else {
                newSortedSquares[--size] = nums[afterIndex] * nums[afterIndex];
                afterIndex--;
            }
        }

        return newSortedSquares;
    }

    // 编写测试用例
    public static void main(String[] args) {
        int[] a = new int[]{-7,-3,2,3,11};
        SortedSquares sortedSquares = new SortedSquares();
        int[] ints = sortedSquares.sortedSquares(a);
        System.out.println(Arrays.toString(ints));
    }
}
