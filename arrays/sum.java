class sum {
    static void sumofnumber(int[]arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
 
    public static void main(String[] args) {
        int [] arr = {1,2,9,8,4};
        sumofnumber(arr);
    }

}

