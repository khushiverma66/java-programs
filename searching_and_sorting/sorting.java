public class sorting {
    public static void main(String[] args) {
        //BubblesortinDescending
        // int arr[]=new int[]{5,4,1,3,2};
        // for(int turn=0;turn<arr.length-1;turn++){
        //     for(int j=0;j<arr.length-1-turn;j++){
        //         if(arr[j]<arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();


        //SelectionSortDescending
        // int arr[]= new int[]{5,4,1,3,2};
        // for(int turn=0;turn<arr.length;turn++){
        //     int minPos = turn;
        //     for(int j=turn+1;j<arr.length;j++){
        //         if(arr[minPos]<arr[j]){
        //             minPos = j;
        //         }
        //     }
        //     //swap
        //     int temp = arr[turn];
        //     arr[turn]= arr[minPos];
        //     arr[minPos]=temp;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();


        //InsertionSortDescending
        int arr[]= new int[]{5,4,1,3,2};
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            //to find the index where curr is to be inserted
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
