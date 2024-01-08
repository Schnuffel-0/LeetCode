package from_600_to_800;

import java.util.*;

public class LeetCode_734 {
    public static void main(String[] args) {
        String[] sentence1 = new String[]{"one","excellent","meal"};
        String[] sentence2 = new String[]{"one","good","dinner"};
        List<String[]> similarPairs = Arrays.asList(
                new String[]{"great", "good"},
                new String[]{"extraordinary", "good"},
                new String[]{"well", "good"},
                new String[]{"wonderful", "good"},
                new String[]{"excellent", "good"},
                new String[]{"fine", "good"},
                new String[]{"nice", "good"},
                new String[]{"any", "one"},
                new String[]{"some", "one"},
                new String[]{"unique", "one"},
                new String[]{"the", "one"},
                new String[]{"an", "one"},
                new String[]{"single", "one"},
                new String[]{"a", "one"},
                new String[]{"truck", "car"},
                new String[]{"wagon", "car"},
                new String[]{"automobile", "car"},
                new String[]{"auto", "car"},
                new String[]{"vehicle", "car"},
                new String[]{"entertain", "have"},
                new String[]{"drink", "have"},
                new String[]{"eat", "have"},
                new String[]{"take", "have"},
                new String[]{"fruits", "meal"},
                new String[]{"brunch", "meal"},
                new String[]{"breakfast", "meal"},
                new String[]{"food", "meal"},
                new String[]{"dinner", "meal"},
                new String[]{"super", "meal"},
                new String[]{"lunch", "meal"},
                new String[]{"possess", "own"},
                new String[]{"keep", "own"},
                new String[]{"have", "own"},
                new String[]{"extremely", "very"},
                new String[]{"actually", "very"},
                new String[]{"really", "very"},
                new String[]{"super", "very"}
        );
        List<List<String>> result = new ArrayList<>();
        for (String[] pair : similarPairs) {
            List<String> innerList = Arrays.asList(pair);
            result.add(innerList);
        }
        System.out.println(areSentencesSimilar(sentence1, sentence2, result));
    }

    public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> similarPair : similarPairs) {
            String ele1 = similarPair.get(0);
            String ele2 = similarPair.get(1);
            if (map.get(ele1) == null) {
                List<String> temp = new ArrayList<>();
                temp.add(ele2);
                map.put(ele1, temp);
            } else {
                List<String> temp = map.get(ele1);
                temp.add(ele2);
                map.put(ele1, temp);
            }
            if (map.get(ele2) == null) {
                List<String> temp = new ArrayList<>();
                temp.add(ele1);
                map.put(ele2, temp);
            } else {
                List<String> temp = map.get(ele2);
                temp.add(ele1);
                map.put(ele2, temp);
            }
        }

        /*for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            System.out.println("Key: " + key);
            System.out.println("Values: " + values);
        }*/

        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i], word2 = sentence2[i];
            if (!word1.equals(word2) && (!map.containsKey(word1) || !map.get(word1).contains(word2))){
                return false;
            }
        }
        return true;
    }
}
