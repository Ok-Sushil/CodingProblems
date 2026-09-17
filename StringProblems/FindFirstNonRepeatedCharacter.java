
import java.util.LinkedHashMap;
import java.util.Map;

// 5. Find first non-repeated character
// Input: swiss
// Output: w
// v1 = using hashmap
// v2 = without using hashmap
class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String s1 = "automation";

        // v1(s1);
        v2(s1);
    }

    static void v1(String s1) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    static void v2(String s1) {

        s1 = s1.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {

            boolean isNonFound = false;

            for (int j = 0; j < s1.length(); j++) {

                if (s1.charAt(i) == s1.charAt(j) && i != j) {

                    isNonFound = true;
                }

            }

            if (!isNonFound) {
                System.out.println(s1.charAt(i));
                break;
            
            }
        }

    }

}
