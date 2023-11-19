import java.util.Scanner;
import java.util.*;

public class peakelement {
    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(nums[mid] < nums[mid + 1]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }   
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        int x = findPeakElement(nums);
        System.out.println(x);
    }
}