package from_1400_to_1600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1599 {
    public static void main(String[] args) {
        int[] customers = {10, 9, 6};
        int boardingCost = 6;
        int runningCost = 4;
        System.out.println(minOperationsMaxProfit(customers, boardingCost, runningCost));
    }

    public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int ans = -1, max = 0, t = 0, wait = 0, i = 0;
        while (wait != 0 || i < customers.length) {
            if (i < customers.length) {
                wait += customers[i];
            }
            int up = wait >= 4 ? 4 : wait;
            wait -= up;
            t += boardingCost * up - runningCost;
            i += 1;
            if (t > max) {
                max = t;
                ans = i;
            }
        }
        return ans;
    }
}
