package movezeroes;

import java.util.Arrays;

/**
 * @Description:  移动0
 * @Author: PanYi
 * @Date: 2023/9/28
 */

public class MoveZeroes {


    /**
     * 使用两次循环，第一次循环移动非0的数字，第二次循环将0移动到末尾
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        int totalZeroNum = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            } else {
                totalZeroNum++;
            }
        }

        for (int i = 0; i < totalZeroNum; i++) {
            nums[nums.length - i - 1] = 0;
        }

    }


    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

}
