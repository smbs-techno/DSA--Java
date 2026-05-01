package Arrays;

public class majorityelement {
     public static int majorityElement(int[] nums) {
        // this code is based on Boyer–Moore Voting Algorithm
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,3};
        System.out.println(majorityElement(arr));
    }
}
