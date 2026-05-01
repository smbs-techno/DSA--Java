package Arrays.Arrays.Subarrays;
public class Subarraysumequalstok {
    static int subarray(int[] arr,int k){
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,1};
        int k=2;
        System.out.println(subarray(arr, k));
    }
}
