package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/9 15:16
 * @description： 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 * <p>
 * 注意：
 * 总人数少于1100人。
 * <p>
 * 示例
 * <p>
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * <p>
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * @version: $
 */
public class Top_406RecontrustQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // if the heights are equal, compare k-values
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });

        List<int[]> output = new LinkedList<>();
        for (int[] p : people) {
            output.add(p[1], p);
        }

        int n = people.length;
        return output.toArray(new int[n][2]);
    }
}
