package from_1_to_200;

public class LeetCode_74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1;
        while (top < bottom) {
            int mid = (bottom - top) / 2 + top;
            if (matrix[mid][0] >= target) {
                bottom = mid;
            } else {
                top = mid + 1;
            }
        }
        System.out.println(bottom);
        System.out.println(top);
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (matrix[top][mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
        System.out.println(right);
        return matrix[top][left] == target ? true : false;
    }
}
