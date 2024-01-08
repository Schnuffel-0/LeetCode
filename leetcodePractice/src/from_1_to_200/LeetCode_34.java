package from_1_to_200;

import java.util.Arrays;

public class LeetCode_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
//        int[] nums = {4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6};
//        Arrays.sort(nums);
//        System.out.println(low_bound(nums, 0));
        int start = low_bound(nums, target);
        if (start == nums.length || nums[start] != target) {
            System.out.println(new int[] {-1, -1});
        }
        int end = low_bound(nums, target + 1) - 1;
        System.out.println(Arrays.toString(new int[] {start, end}));
    }

    public static int low_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid  - 1;
            }
        }
        return left;
    }
}

