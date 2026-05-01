package Arrays.Arrays.Subarrays;
public class rotatearrayclockwise {
    static void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static int[] rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] nums=rotate(arr, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
