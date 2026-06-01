package Maths;
public class minimumelementafterreplacementwithdigitsum{
     public static int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int d = nums[i]%10;
                sum+=d;
                nums[i]=nums[i]/10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr={10,12,13,15};
        System.out.println(minElement(arr));
    }
}