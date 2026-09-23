// Reverse String without built-in method	🔴 4/5	Reported in Deloitte/Infosys/SDET material, although this itself is basic. Its value is mainly in follow-ups. (LinkedIn)

class Q7ReverseStringWithoutBuiltInMethod {

    public static void main(String[] args) {
        String input = "sushil";

        // String output = "";
        // for( int i = input.length()-1 ; i >=0 ; i-- ){
        //      output += input.charAt(i) ;
        // }
        // System.out.println(output);
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));

        }

        System.out.println(output);

    }
}
