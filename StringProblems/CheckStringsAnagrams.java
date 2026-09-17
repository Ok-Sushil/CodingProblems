// 7. Check whether two strings are anagrams
// listen
// silent
// Output:
// TRUE

// Do it using:
// sorting
// frequency map
// streams
import java.util.Arrays;
import java.util.HashMap;

class CheckStringsAnagrams {

    public static void main(String[] args) {
        String input1 = "listel";
        String input2 = "silent";

        System.out.println(v1(input1.toLowerCase(), input2.toLowerCase()));
        System.out.println(v2(input1.toLowerCase(), input2.toLowerCase()));
        // v3(input);
    }

    static boolean v1(String s1, String s2) { //sorting

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    static boolean v2(String s1, String s2) {  //frequency map

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        }

        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        }

        return map1.equals(map2);

    }

    // static boolean v3(String s1) {
    //    this is something not needsd right now streams
    //     return false;
    // }
}
