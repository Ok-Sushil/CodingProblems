
import java.util.HashMap;
import java.util.Map;

// 4. Find duplicate characters
// Input: automation
// Output: a, t, o
// v1 = hashmap
// v2 = without hashmap
class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "Automation";
        v1(input);
        v2(input);

    }

    static void v1(String s1) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }
    }

    static void v2(String s1) {

        for (int i = 0; i < s1.length(); i++) {
            boolean isDuplicated = false;

            boolean isVisited = false;

            char chi = s1.toLowerCase().charAt(i);

            for (int k = 0; k < i; k++) {

                if (chi == s1.toLowerCase().charAt(k)) {
                    isVisited = true;
                }

            }

            if (!isVisited) {
                for (int j = 0; j < s1.length(); j++) {

                    char chj = s1.toLowerCase().charAt(j);
                    if (chi == chj && i != j) {
                        isDuplicated = true;
                        break;
                    }

                }

                if (isDuplicated == true) {
                    System.out.println(chi);
                }

            }

        }

    }

}
