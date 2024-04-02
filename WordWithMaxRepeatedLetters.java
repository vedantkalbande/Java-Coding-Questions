import java.util.HashMap;
import java.util.Map;

public class WordWithMaxRepeatedLetters {
      public static String findWordWithMaxRepeatedLetters(String str) {
        String[] words = str.split(" ");
        String maxWord = "";
        int maxCount = 0;
        for (String word : words) {
            Map<Character, Integer> freqMap = new HashMap<>();
            int count = 0;
            for (char ch : word.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                count = Math.max(count, freqMap.get(ch));
            }
            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
        }
        return maxCount > 1 ? maxWord : "-1";
    }

    public static void main(String[] args) {
        String str1 = "abcdefghij google microsoft";
        String str2 = "cameron blue";
        System.out.println("Output 1: " + findWordWithMaxRepeatedLetters(str1));
        System.out.println("Output 2: " + findWordWithMaxRepeatedLetters(str2));
    }
}

