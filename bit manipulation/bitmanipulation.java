public class bitmanipulation {
    public static void main(String[] args) {
        //oddoreven
        // int n = 14;
        // int bitmask = 1;
        // if((n & bitmask)== 0){
        //     System.out.println("even number");
        // }
        // else{
        //     System.out.println("odd number");
        // }

        //get ith bit
        // int n = 10;
        // int i = 2;
        // int bitMask = 1<<i;
        // if((n & bitMask)==0){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("1");
        // }

        //set ith bit
        // int n=10;
        // int i=2;
        // int bitMask = 1<<i;
        // int b = n | bitMask;
        // System.out.println(b); 

        //clear ith bit 
        // int n = 10;
        // int i=1;
        // int bitmask = ~(1<<i);
        // int b = n & bitmask;
        // System.out.println(b);

        //clear last i bits
        // int n = 15;
        // int i = 2;
        // int bitmask = (~0)<<i;
        // int b = n & bitmask;
        // System.out.println(b);

        //clear range of bits
        // int n = 10;
        // int i = 2;
        // int j = 4;
        // int a = ((~0)<<(j+1));
        // int b = (1<<i)-1;
        // int bitMask = a | b;
        // int c = n & bitMask;
        // System.out.println(c);

        //power of 2 or not
        // int n = 15;
        // if((n & (n-1))==0){
        //     System.out.println("true");
        //  }
        //  else{
        //     System.out.println("false");
        //  }

        //count set bits
        // int n = 10;
        // int count = 0;
        // while(n>0){
        //     if((n & 1) != 0){=
        //         count++;
        //     }
        //     n = n>>1; 
        // }
        // System.out.println(count);

         
        //fast exponentiation
        // int a = 3;
        // int n = 5;
        // int ans = 1;
        // while (n>0){
        //     if((n & 1) != 0) {
        //         ans = ans * a;
        //     }
        //     a = a * a;
        //     n = n>>1;
        // }
        // System.out.println(ans);

        // upper case to lower case
        String str = "Hello";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        }
        for(char ch = 'A';ch>='Z';ch++){
            System.out.println((char)(ch | 32));
        }
    } 
}
