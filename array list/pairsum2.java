import java.util.ArrayList;
import java.util.*;
public class pairsum2 {
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int pivot = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){ //breaking point
                pivot = i;
                break;
            }
            int lp = pivot + 1; //smallest
            int rp = pivot;
            while(lp != rp){
                //case1
                if(list.get(lp) + list.get(rp) == target){
                    return true;
                }
                if(list.get(lp) + list.get(rp) < target){
                    //case2 
                    lp = (lp+1) % n;
                }
                else{
                    //case3
                    rp = (n+rp-1)%n;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
