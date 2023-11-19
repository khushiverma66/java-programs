public class twodarray {
    public static void main(String[] args) {
        // int [][] matrix = new int[][]{{4,7,8},{8,8,7}};
        // int count=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==7){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        // int [][] matrix = new int[][]{{1,4,9},{11,4,3},{2,2,3}};
        // int sum=0;
        // for(int j=0;j<matrix[0].length;j++){
        //     sum+=matrix[1][j];
        // }
        // System.out.println(sum);

    //     int row = 2; int column=3;
    //     int [][] matrix = {{2,3,7},{5,6,7}};
    //     int [][] transpose = new int[column][row];
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<column;j++){
    //             transpose[j][i]=matrix[i][j];
    //         }
    //     }
    //     for(int i=0;i<transpose.length;i++){
    //         for(int j=0;j<transpose[0].length;j++){
    //             System.out.print(transpose[i][j]+" ");
    //         }
    //         System.out.println();
    // }

    // int row=2; int column=5;
    int [][]matrix = new int[][]{{3,5,8},{7,4,8}};
    int key = 7;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("found");
                break;
            }
            
        }
    }
}
}