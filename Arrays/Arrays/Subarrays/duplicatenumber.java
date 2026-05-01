package Arrays.Arrays.Subarrays;

public class duplicatenumber {
     public static int findDuplicate(int[] nums) {
       int slow=nums[0];
       int fast=nums[0];
       do{
        slow=nums[slow];
        fast=nums[nums[fast]];
       }while(slow!=fast);
       slow=nums[0];
       while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
       }
       return slow;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5};
        System.out.println(findDuplicate(arr));
    }
}
