import java.util.*;
public class squareroot {
    public static int binarySearch(int n){
        int s = 0;
        int e = n;
        int ans = -1; //for big numbers
        while(s<=e){
            int mid = s + (e-s)/2;
            int square = mid*mid;
            if(square == n){
                return mid;
            }
            if(square<n){
                ans = mid;
                s = mid +1;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    // public static int sqrt(int x){
    //     return binarySearch(x);
    // }
    public static void main(String[] args) {
        int n = 69;
        System.out.println(binarySearch(n));
    }
}
