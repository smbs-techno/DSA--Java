package Arrays.Arrays.Subarrays;

public class nondecsubsequence {
    
    static final int MOD=1000000007;
    static int count;
    static void nondec(int[] arr,int index,int last,int len){
        if(index==arr.length) {
            if(len>0) count=(count+1)%MOD;
                return;
            }
        if(last==Integer.MIN_VALUE || arr[index]>=last){
            nondec(arr, index+1, arr[index], len+1);
        }
        nondec(arr,index+1,last,len);
    }
    public static void main(String[] args) {
        int[] arr={1,8,2,5};
        nondec(arr, 0, Integer.MIN_VALUE, 0);
        System.out.println(count);
    }
}


