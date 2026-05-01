package TwoDArray;

public class rotateimage {
    // we have solve this problem using an extra array, tc->O(n**2) sc-O(n**2) 
    // static int[][] solve(int[][] arr){
    //     int n=arr.length;
    //     int[][] mat=new int[n][n];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             mat[j][n-1-i]=arr[i][j];
    //         }
    //     }
    //     return mat;
    // }
    // tc->O(n**2),sc->O(1)
    public static void solve(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        solve(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // int[][] mat=solve(arr);
        // int n=mat.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
