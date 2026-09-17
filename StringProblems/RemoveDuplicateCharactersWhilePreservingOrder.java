import java.util.LinkedHashSet;

// 6. Remove duplicate characters while preserving order
// Input:
// programming
// Output:
// progamin
// v1 = with set
// v2 = wihtout set
class RemoveDuplicateCharactersWhilePreservingOrder {

    public static void main(String[] args) {
        String input = "programming";

        v1(input.toLowerCase());
        v2(input.toLowerCase());
    }

    static void v1(String s1) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        System.out.println(set);

        System.out.println("-=====-");

    }

    static void v2(String s1) {

        for (int i = 0; i < s1.length(); i++) {                        // i=0,   p = false, p != p  

            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (s1.charAt(i) == s1.charAt(k)) {
                    visited = true;
                }
            }

            if (!visited) {

                System.out.println(s1.charAt(i));

            }

        }

    }

}
