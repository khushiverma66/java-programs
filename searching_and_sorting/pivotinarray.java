public class pivotinarray {
    public static int pivotarray(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while(s<e){
            int mid = s + (e-s)/2;
            if(nums[mid]>=nums[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    public static void main(String[] args) {
        int [] nums = {8,10,17,1,3};
        System.out.println(pivotarray(nums));
    }
}
