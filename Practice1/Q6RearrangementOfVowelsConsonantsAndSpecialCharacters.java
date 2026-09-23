
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

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (Character.isLetter(c)
                    && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {

                out.append(c);
            }
        }

        // Digits
        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (Character.isDigit(c)) {
                out.append(c);
            }
        }

        // Special characters
        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                out.append(c);
            }
        }

        System.out.print(out);

    }

}
