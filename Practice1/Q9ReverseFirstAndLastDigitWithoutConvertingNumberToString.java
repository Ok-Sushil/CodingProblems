// Reverse first and last digit without converting number to String	🔴 5/5	Repeated across several independent GlobalLogic interview reports. (LinkedIn)


class Q9ReverseFirstAndLastDigitWithoutConvertingNumberToString {

    public static void main(String[] args) {

        int num = 12345;
        // output = 52341;

        // Handle single-digit number
        if (num < 10) {
            System.out.println(num);
            return;
        }

        int lastDigit = num % 10;

        // Find divisor to extract first digit
        int divisor = 1;
        int temp = num;

        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }

        int firstDigit = num / divisor;

        // Remove first and last digits
        int middle = (num % divisor) / 10;

        // Construct result
        System.out.println(lastDigit * divisor + middle * 10 + firstDigit);
    }
}
