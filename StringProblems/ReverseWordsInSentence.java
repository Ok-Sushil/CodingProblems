class ReverseWordsInSentence {

    public static void main(String[] args) {
        // Input:
        // I love Java
        // Output:
        // I evol avaJ

        String input = "I love Java";

        ReverseWordsInSentence obj = new ReverseWordsInSentence();
        System.out.println(obj.v1(input));

    }

    String v1(String s1) {

        StringBuilder output = new StringBuilder();

        String arr[] = s1.split(" ");

        int i = arr.length - 1;

        while (i >= 0) {

            output.append(arr[i]);

            if (i != 0) {
                output.append(" ");
            }

            i--;
        }

        return output.toString();

        // String arr[] = s1.split(" ");

        // int i = arr.length -1;

        // while(i>=0){

        // System.out.print(arr[i]);

        // if(i != 0){
        // System.out.print(" ");
        // }

        // i--;
        // }

    }
}