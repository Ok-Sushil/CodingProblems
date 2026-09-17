import java.util.LinkedHashMap;

class CharacterFrequency {

    public static void main(String[] args) {

        // Example:
        // Input: automation
        // a = 2
        // u = 1
        // t = 2
        // o = 2
        // m = 1
        // i = 1
        // n = 1
        // Variants:
        // using HashMap
        // without HashMap
        // using Java Streams

        String input = "automation";
        v2(input);

    }

    static void v1(String s1) {
        // using HashMap
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }

    static void v2(String s2) {
        // without HashMap

        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);
            boolean isAlreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (s2.charAt(k) == ch) {
                    isAlreadyCounted = true;
                    break;
                }
            }

            int count = 0;

            if (!isAlreadyCounted) {

                for (int j = 0; j < s2.length(); j++) {

                    if (s2.charAt(i) == s2.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(ch + " " + count);

            }

        }

    }

    static void v3(String s3) {
        // using Java Streams
        // Not needed for now

    }
}