package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/14 8:27
 * @description： 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 * @version: $
 */
public class Top_448FindDisappearedNumbers {
    public List<Integer> solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int[] detect = new int[len];

        for (int i = 0; i < len; i++) {
            detect[nums[i] - 1] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (detect[i] != 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
