package from_1800_to_2000;

public class LeetCode_1901 {
    public static void main(String[] args) {

    }

    public static int[] findPeakGrid01(int[][] mat) {
        return new int[] {};
    }

    public static int[] findPeakGrid02(int[][] mat) {
        return new int[] {};
    }

    public static int indexOfMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        return index;
    }
}
