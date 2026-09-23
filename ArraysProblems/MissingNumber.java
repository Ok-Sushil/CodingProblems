// missing number birla soft , netomi 
class MissingNumber {

    public static void main(String[] args) {

        int[] a = {2, 1, 3, 5, 8, 6, 7};

        int n = a.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : a) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number : " + missingNumber);
    }
}
