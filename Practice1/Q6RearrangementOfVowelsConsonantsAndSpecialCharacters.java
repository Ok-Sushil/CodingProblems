
class Q6RearrangementOfVowelsConsonantsAndSpecialCharacters {

    public static void main(String[] args) {
        // Input:
        // a1b@e#c3i

        // Output:
        // aeibc1@#3
        String s1 = "a1b@e#c3i";

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {

                out.append(s1.charAt(i));

            }

        }

        System.out.print(out);

    }

}
