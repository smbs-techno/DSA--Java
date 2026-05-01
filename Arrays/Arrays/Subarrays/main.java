package Arrays.Arrays.Subarrays;
public class main {
    public static void sort0and1and2(int[] nums) {
        int count0=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
        }
        for(int i=0;i<count0;i++){
            nums[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            nums[i]=1;
        }
        for(int i=count1+count0;i<nums.length;i++){
            nums[i]=2;
        }
    }
    public main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sort0and1and2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}