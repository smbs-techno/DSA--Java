package TwoDArray;

public class setmatrixto0 {
    // if the matrix only contains 0 and 1 this code will work(only for binary matrix)
    // public static void setZeroes(int[][] matrix) {
    //     int rows=matrix.length;
    //     int cols=matrix[0].length;
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<cols;j++){
    //             if(matrix[i][j]==0){
    //                 for(int k=0;k<rows;k++){
    //                     if(matrix[k][j]!=0){
    //                         matrix[k][j]=-1;
    //                     }
    //                 }
    //                 for(int k=0;k<cols;k++){
    //                     if(matrix[i][k]!=0){
    //                         matrix[i][k]=-1;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<cols;j++){
    //             if(matrix[i][j]==-1) matrix[i][j]=0;
    //         }
    //     }
    // }
    static void solve(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] row=new int[rows];
        int[] col=new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i]==1 || col[j]==1) matrix[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        solve(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
