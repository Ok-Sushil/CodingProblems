
import java.util.HashMap;

class Q11AnagramUsingHashMapFrequencyLogic {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("False Anagram");
            return;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        }

        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        }

        if (map1.equals(map2)) {
            System.out.println("True Anagram");
        } else {
            System.out.println("False Anagram");
        }

    }
}
