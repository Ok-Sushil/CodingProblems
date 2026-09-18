
import java.util.HashMap;
import java.util.Map;

// Second most frequent/repeating character
// Example:
// Input:
// aabbcccdd
// Output:
// a
// or depending on interpretation, determine the second-highest frequency character.
// This exact pattern has appeared in recent Deloitte-related interview reports.
class SecondMostRepeatingCharacter {

    public static void main(String[] args) {
        String input = "aabbcccdd";

        v1(input);
    }

    static void v1(String s1) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        int s_max = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                s_max = max;
                max = entry.getValue();
            } else if (entry.getValue() > s_max && entry.getValue() < max) {
                s_max = entry.getValue();

            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == s_max) {
                System.out.println(entry.getKey());
                break;
            }

        }

    }

    // static void v2(String s1) {
    // }
}
