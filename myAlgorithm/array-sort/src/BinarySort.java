/**
 * @Description: 二分查找
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class BinarySort {

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int prev = 0;
        int after = nums.length - 1;
        while (prev <= after) {
            int mid = (prev + after) >> 1;
            if (nums[mid] > target) {
                after = mid - 1;
            } else if (nums[mid] < target) {
                prev = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // 写测试用例
        BinarySort binarySort = new BinarySort();
        int[] nums = new int[]{2,5};
        int search = binarySort.search(nums, 5);
        System.out.println(search);
    }



}
