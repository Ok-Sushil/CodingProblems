


class FindSecondSmallestElement {

    public static void main(String[] args) {
        int input[] = new int[]{1, 2, 3, 4, 5};

        v1(input);
    }

    static void v1(int a[]) {

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int n : a){

            if(n< smallest){

                second_smallest = smallest;
                smallest = n;

            } else if(n < second_smallest && n != smallest){
                second_smallest = n;

            }

        
        }


        System.out.println("Smallest : "+ smallest);
        System.out.println("second smallest : "+ second_smallest);

        


    }

}
