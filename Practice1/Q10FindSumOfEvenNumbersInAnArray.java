// Find sum of even numbers in an array	🟠 3/5	Explicit GlobalLogic report. (LinkedIn)

class Q10FindSumOfEvenNumbersInAnArray {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for (int n : a) {

            if (n % 2 == 0) {
                sum += n;
            }

        }

        System.out.println(sum);
    }

}
