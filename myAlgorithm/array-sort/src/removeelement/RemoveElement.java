package removeelement;

import java.util.Arrays;

/**
 * @Description: 移除元素
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // 快慢指针
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public void removeElementViolence(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
    }


    public static void main(String[] args) {
        // 写测试用例
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        removeElement.removeElementViolence(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

}
