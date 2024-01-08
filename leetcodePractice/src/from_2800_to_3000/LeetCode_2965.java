package from_2800_to_3000;

import java.util.Arrays;

public class LeetCode_2965 {
    public static void main(String[] args) {
        int[][] grid = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int n = grid.length;
        int[] cnt = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt[grid[i][j]] += 1;
            }
        }
        int[] ans = new int[] {0, 0};
        for (int i = 0; i < n * n + 1; i++) {
            if (cnt[i] == 2) {
                ans[0] = i;
            } else if (cnt[i] == 0) {
                ans[1] = i;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
