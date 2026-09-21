// Find duplicate elements efficiently	🔴 5/5	Appears in recent SDET interview reports and senior coding discussions. (LinkedIn)

import java.util.HashSet;

class Q4FindDuplicateElementsEfficiently {

    public static void main(String[] args) {

        int a[] = new int[]{1, 2, 3, 4, 5, 3};

        HashSet<Integer> set = new HashSet<>();

        for (int n : a) {

            if (!set.add(n)) {
                System.out.print(n);
            }

        }
    }

}
