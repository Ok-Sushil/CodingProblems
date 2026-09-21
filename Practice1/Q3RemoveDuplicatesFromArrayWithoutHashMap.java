// Remove duplicates from array without HashMap	🔴 5/5	Explicit GlobalLogic report; another Wipro report includes duplicate removal + character counting. (LinkedIn)

class Q3RemoveDuplicatesFromArrayWithoutHashMap {

    public static void main(String[] args) {

        int a[] = new int[]{1, 2, 3, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {

                if(a[i] == a[j]  && i !=j ){
                    isDuplicate = true; 
                }

            }

            if (!isDuplicate) {
                   System.out.println(a[i]);
            }

        }

    }

}
