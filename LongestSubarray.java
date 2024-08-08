import java.util.HashMap;

public class LongestSubarray{
    public static int cipherQuest(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            if (charIndexMap.containsKey(s.charAt(right))) {
                left = Math.max(charIndexMap.get(s.charAt(right)) + 1, left);
            }
            charIndexMap.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(cipherQuest("abcabcbb")); // Output: 3
        System.out.println(cipherQuest("abcbacdbb")); // Output: 4
        System.out.println(cipherQuest("bbbbb")); // Output: 1
    }
}



// Input: "abcabcbb"

// Output: 3

// Explanation: The longest substring without repeating characters is "abc" with a length of 3.