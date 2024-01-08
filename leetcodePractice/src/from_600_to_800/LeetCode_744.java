package from_600_to_800;

public class LeetCode_744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        while (l <= r) {
            int m = (r - l) / 2 + l;
            if (letters[m] < target) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }
        return (l < letters.length && letters[l] == target) ? letters[l] : letters[0];
    }
}
