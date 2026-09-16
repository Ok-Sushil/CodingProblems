
class ReverseString {

    public static void main(String[] args) {

        String s1 = "Sushil Saini";

//v1  using char[]
        v1(s1);

//v2 using loop
        v2(s1);

// v3 using string builder 
        System.out.println(v3(s1));

// v4 without using extraa space
        v4(s1);

// v5 in place reversal 
        v5(s1);

    }

// Variants:
// using char[]
    static void v1(String s1) {

        char[] arr = s1.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        System.out.println();

    }

// using loop
    static void v2(String s1) {
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }

        System.out.println();

    }

// using StringBuilder
    static String v3(String s1) {
        StringBuilder out = new StringBuilder(s1);
        out.reverse();
        String output = out.toString();
        return output;

        // StringBuilder output = new StringBuilder();
        // for(int i = s1.length()-1 ; i >=0 ; i--){
        //     output.append(s1.charAt(i)); 
        // }
        // return output.toString();
    }

// without extra space
    static void v4(String s1) {
        System.out.println("Sorry it can not be possible because in java strings are immutable thanks !");
    }

// in place reversal of string array or char array
    static void v5(String s1) {

        char arr[] = s1.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
    }

}
