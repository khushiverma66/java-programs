
class search{
    void search1(){
        int[] arr={1,7,9,4};
        int x = 4;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}

public class searchinarr{
    public static void main(String[] args) {
        search obj = new search();
        obj.search1();;
    }
}
