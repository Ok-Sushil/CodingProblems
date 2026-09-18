// 10. Extract numbers from an alphanumeric String
// Input:
// QA123Automation456

// Output:
// 123456
class ExtractNumbersFromAlphanumericString {

    public static void main(String[] args) {
        String input = "QA123Automation456";

        v1v3(input);
        v1(input);
        v2(input);
        v4(input);
        v5(input);

    }

    static void v1(String s1) {

        int n = 0;

        for (char c : s1.toCharArray()) {

            if (Character.isDigit(c)) {
                n = (n * 10) + (c - '0');

            }
        }

        System.out.println(n);

    }

    static void v1v3(String s1) {

        StringBuilder out = new StringBuilder();

        for (char c : s1.toCharArray()) {

            if (Character.isDigit(c)) {
                out.append(c);

            }
        }

        System.out.println(Integer.parseInt(out.toString()));

    }

    static void v2(String s1) {

        String numbers = s1.replaceAll("[^0-9]", "");

        System.out.println(numbers);
    }

    static void v4(String s1) {

        for (char c : s1.toCharArray()) {

            if (c >= '0' && c <= '9') {
                System.out.print(c);
            }

        }
        System.out.println();

    }

    static void v5(String s1) {

        for (char c : s1.toCharArray()) {

            int n = (int) c;

            if (n >= 48 && n <= 57) {
                System.out.print(c);
            }

        }

    }

}

// v1 = Character.isDigit()
// v2 = Regex se
// v3 = Integer.parseInt()
// v4 = AscII
// v5 = AscII 2
