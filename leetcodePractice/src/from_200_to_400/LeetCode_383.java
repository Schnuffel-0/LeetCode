package from_200_to_400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        String[] temp = magazine.split("");
        System.out.println(Arrays.toString(temp));
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            cnt[magazine.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--cnt[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
