class max{
    void max1(){
        int[] arr={1,7,9,4};
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}

public class maxofarr {
    public static void main(String[] args) {
        max obj = new max();
        obj.max1();
    }
}
