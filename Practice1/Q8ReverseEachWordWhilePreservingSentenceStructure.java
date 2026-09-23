// Reverse each word while preserving sentence structure	🔴 4/5	Explicit Deloitte SDET-3 report. (LinkedIn)

class Q8ReverseEachWordWhilePreservingSentenceStructure {

    public static void main(String[] args) {
        String input = "sushil saini is the great coder";

        String[] midOut = input.split(" ");

        String output = "";

        for (int i = midOut.length - 1; i >= 0; i--) {
            output += midOut[i];

            if (i != 0) {
                output += " ";
            }
        }
        System.out.println(output);

    }

}
