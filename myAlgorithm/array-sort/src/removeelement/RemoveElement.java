package removeelement;

import java.util.Arrays;

/**
 * @Description: 移除元素
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length --;
            } else {
                i ++;
            }
        }
        return length;
    }


    public static void main(String[] args) {
        // 写测试用例
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int i = removeElement.removeElement(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

}
