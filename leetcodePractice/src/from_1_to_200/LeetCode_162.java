package from_1_to_200;

public class LeetCode_162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement01(nums));
        System.out.println(findPeakElement02(nums));
    }

    // 闭区间算法
    public static int findPeakElement01(int[] nums) {
        int left = 0, right = nums.length - 2;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    // 开区间算法
    public static int findPeakElement02(int[] nums) {
        int left = -1, right = nums.length - 1;
        while (left  + 1 < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < nums[mid + 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
