// 9. Count vowels and consonants
// Input:
// Automation

// Vowels = 6
// Consonants = 4
// Reported in recent QA automation interview discussions.
class CountVowelsConsonants {

    public static void main(String[] args) {
        String input = "Sushil";

        v1(input);
    }

    static void v1(String s1) {
        s1 = s1.toLowerCase();
        int c_count = 0;
        int v_count = 0;

        for (char c : s1.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c_count++;

            } else {
                v_count++;
            }
        }
        System.out.println("consonent count : " + c_count);
        System.out.println("vowels count : " + v_count);

    }

}
