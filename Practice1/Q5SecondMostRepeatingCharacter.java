// Second most repeating character	🔴 4/5	Explicitly reported in recent Deloitte 3–5 YOE interview material. (LinkedIn)

import java.util.HashMap;
import java.util.Map;

class Q5SecondMostRepeatingCharacter {

    public static void main(String[] args) {

        String s = "sushhil";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        int s_max = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                s_max = max;
                max = entry.getValue();
            } else if (entry.getValue()< max && entry.getValue() > s_max) {
                s_max = entry.getValue();
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == s_max) {
                System.out.println("char which is accurent second most time int he string thanks : " + entry.getKey());
                break;
            }

        }

    }
}
