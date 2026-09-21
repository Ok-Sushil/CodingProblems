// Character frequency using HashMap	🔴 5/5	Reported in recent 3–5+ YOE SDET interview. (LinkedIn)

import java.util.LinkedHashMap;

class Q2CharacterFrequencyUsingHashMap {

    public static void main(String[] args) {

        String s = "sushil";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        // for (int i = 0; i < s.length(); i++) {

        //     int count = 0;
        //     boolean isVisited = false;

        //     for (int k = 0; k < i; k++) {

        //         if (s.charAt(i) == s.charAt(k)) {
        //             isVisited = true;

        //         }
        //     }

        //     if (!isVisited) {

        //         for (int j = 0; j < s.length(); j++) {

        //             if (s.charAt(i) == s.charAt(j)) {

        //                 count++;

        //             }

        //         }

        //         System.out.println(s.charAt(i) + " " + count);

        //     }

        // }

    }
}
