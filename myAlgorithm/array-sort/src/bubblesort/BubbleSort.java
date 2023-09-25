package bubblesort;

/**
 * @Description:
 * @Author: PanYi
 * @Date: 2023/9/25
 */

public class BubbleSort {


    public int[] bubbleSortStable(int[] orArray) {
        if (orArray == null || orArray.length == 0) {
            return orArray;
        }

        int length = orArray.length;
        for (int i = 0; i < length; i++) {
            // 发生交换的标志位
            boolean flag = false;
            for (int j = 0; j < length - i - 1; j ++) {
                if (orArray[j] > orArray[j + 1]) {
                    int temp = orArray[j];
                    orArray[j] = orArray[j + 1];
                    orArray[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return orArray;
    }




    // 生成测试用例
    public static void main(String[] args) {
        int[] orArray = {1, 3, 2, 5, 4};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.bubbleSortStable(orArray);
        for (int i : result) {
            System.out.println(i);
        }
    }



}
