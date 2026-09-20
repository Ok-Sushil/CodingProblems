class FindSecondLargestElement{
    public static void main(String[] args) {

       int a[] =  {10, 5, 20, 8, 20};

       v1(a);


    }

    static void v1( int arr[]){

      int max = 0; 
      int s_max =0;

      for( int n : arr){

        if(n> max){
            s_max = max;
            max =n ; 
        }else if( n > s_max  && n < max){
            s_max = n;
        }
      }

      System.out.println("max : "+ max); 
      System.out.println("s_max : "+ s_max);

    }
}