public class searchinrotatedarray {
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
        }
        return s;
    }
    public static int binarySearch(int nums[],int s,int e, int target){
        int start = s;
        int end = e;

        while(start <= end){
            int mid = start + (end-start)/2;
            System.out.println(mid);
            System.out.println(target);
            if(nums[mid] == target){
                return mid;
            }

            //go to right wala part
            if(target > nums[mid]){
                start = mid + 1;
            }{
                end = mid - 1;
            }
            // mid = start + (end-start)/2;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int pivot = pivotarray(nums);
        //bs on first line
        if(target>nums[pivot] && target<nums[nums.length-1]){
            return binarySearch(nums,pivot,nums.length-1,target);
        }
        //bs on second line
        else{
            return binarySearch(nums,0,pivot-1,target);
        }
    }
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }
}
