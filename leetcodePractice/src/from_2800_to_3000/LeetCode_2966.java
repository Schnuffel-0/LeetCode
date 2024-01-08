package from_2800_to_3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_2966 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k = 2;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[][] ans = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                ans[i / 3] = new int[] {nums[i], nums[i + 1], nums[i + 2]};
            } else {
                System.out.println(false);
                break;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
