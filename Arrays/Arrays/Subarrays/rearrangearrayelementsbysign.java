package Arrays.Arrays.Subarrays;

public class rearrangearrayelementsbysign{

    public static int[] rearrangeArray(int[] nums) {
            int[] arr=new int[nums.length];
            int po=0;
            int ne=1;
            int n=nums.length;
            int i=0;
            while(i<n){
                if(nums[i]>0){
                    arr[po]=nums[i];
                    po=po+2;
                }
                else{
                    arr[ne]=nums[i];
                    ne=ne+2;
                }
                i++;
            }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] res=rearrangeArray(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}