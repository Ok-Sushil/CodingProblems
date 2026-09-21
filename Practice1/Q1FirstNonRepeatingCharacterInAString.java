// First non-repeating character in a String	🔴 5/5	Reported in LTIMindtree 3–5+ YOE and product-company SDET experience. (LinkedIn)

import java.util.LinkedHashMap;
import java.util.Map;

class Q1FirstNonRepeatingCharacterInAString {

    public static void main(String[] args) {

        String s = "susuhilh";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }

        }

        // for( int i=0 ; i < s.length() ; i++){

        //     boolean isDuplicate =  false;

        //     for(int j =0 ; j< s.length() ; j++){

        //         if(s.charAt(i)  == s.charAt(j) && i != j ){
        //             // System.out.println(s.charAt(i));
        //             isDuplicate = true;
        //             break;
                    
        //         }

        //     }

        //     if(!isDuplicate){
        //         System.out.println(s.charAt(i));
        //         break;
        //     }




        // }


    }
}
