package Arrays.Arrays.Subarrays;

public class productofarrayexceptself {
    static int[] solve(int[] arr){
        int[] prefix=new int[arr.length];
        int[] suffix=new int[arr.length];
        int[] res=new int[arr.length];
        prefix[0]=1;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        suffix[suffix.length-1]=1;
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<res.length;i++){
            res[i]=prefix[i]*suffix[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] res=solve(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
