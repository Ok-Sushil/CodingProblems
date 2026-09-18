class UtilityToCheckCountOrExtractUrlsFromString {

    public static void main(String[] args) {

        // String s1 = "https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/1,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/2,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/3,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/4,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/5,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/6,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/7,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/8,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/9,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/10,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/11,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/12,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/13,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/14,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/15,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/16,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/17,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/18,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/19,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/20,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/21,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/22,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/23,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/24,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/25,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/26,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/27,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/28,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/29,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/30,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/31,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/32,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/33,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/34,https://images.propstream.com/E/82453971/0/b6bfee7af56e5527/35";

        // String[] out = s1.split(",");

        // for(String s : out){
        //     System.out.println(s);
        // }

        // System.out.println(out.length);


        int a[] = {1,2,5,3,4,5,5}; 

        int max = 0; 
        int s_max =0; 

        for(int i = 0 ; i < a.length ;i++){

            if(a[i] > max ){
                 s_max = max; 
                max = a[i]; 
               
            }else if(a[i] < max){
                s_max = a[i]; 
            }

        }


        System.out.println(max +" "+ s_max);

    }
}
