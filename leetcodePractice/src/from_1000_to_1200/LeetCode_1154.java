package from_1000_to_1200;

public class LeetCode_1154 {
    public static void main(String[] args) {
        System.out.println(dayOfYear("1900-05-02"));
    }
    public static int dayOfYear(String date) {
        String[] dateStr = date.split("-");
        boolean flag = false;
        /**
            闰年计算方法：四年一闰，百年不闰，四百年再闰
         */
        if ((Integer.valueOf(dateStr[0]) % 4 == 0 && Integer.valueOf(dateStr[0]) % 100 != 0) || Integer.valueOf(dateStr[0]) % 400 == 0) {
            flag = true;
        }
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        int m = Integer.valueOf(dateStr[1]) - 1;
        while (m > 0) {
            sum += month[m];
            m -= 1;
        }
        sum += Integer.valueOf(dateStr[2]);
        if (Integer.valueOf(dateStr[1]) >= 2 && flag == true) {
            sum += 1;
        }
        return sum;
    }
}
