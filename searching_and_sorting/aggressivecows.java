import java.util.*;

public class aggressivecows {
    public static boolean isPossible(int []stalls,int k,int mid){
        int cowCount = 1;
        int lastPos = stalls[0];

        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastPos >= mid){
                cowCount++;
                if(cowCount==k){
                    return true;
                }
                lastPos = stalls[i];
            }
        }
        return false;
    }
    public static int aggressiveCows(int []stalls,int k){
        Arrays.sort(stalls);
         int s = 0;
         int maxi = -1;
         for(int i=0;i<stalls.length;i++){
            maxi = Math.max(maxi,stalls[i]);
         }
         int e = maxi;
         int ans = -1;
         int mid = s + (e-s)/2;

         while(s<=e){
            if(isPossible(stalls,k,mid)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
         }
         return ans;
    }
    public static void main(String[] args) {
        int []stalls={4,2,1,3,6};
        System.out.println(aggressiveCows(stalls, 2));
    }
}
