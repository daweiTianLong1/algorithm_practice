package mergetwoarray;

import java.util.Arrays;

/**
 * @Description: 合并两个有序数组
 * @Author: PanYi
 * @Date: 2023/9/27
 */

public class MergeTwoArray {

    /**
     * @param nums1
     * @param m   nums1中元素的个数
     * @param nums2
     * @param n   nums2的元素的个数
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从后往前遍历
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p1 + p2 + 1] = nums1[p1] <= nums2[p2] ? nums2[p2--] : nums1[p1--];
        }

        // 如果nums2还有剩余
        while (p2 >= 0) {
            nums1[p1+p2+1] = nums2[p2--];
        }

    }


    // 生成测试用例
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2,5,6};
        MergeTwoArray mergeTwoArray = new MergeTwoArray();
        mergeTwoArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }







}
