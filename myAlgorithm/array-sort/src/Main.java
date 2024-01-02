import java.util.*;

/**
 * @Description: 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 * @Author: PanYi
 * @Date: 2023/9/26
 */

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        while(in.hasNext()) {
            int indexNum = in.nextInt();

            for (int i = 0; i < indexNum; i++) {
                int index = in.nextInt();
                int value = in.nextInt();
                if (map.containsKey(index)) {
                    map.put(index, map.get(index) + value);
                } else {
                    map.put(index, value);
                }
            }
        }

    }



}
