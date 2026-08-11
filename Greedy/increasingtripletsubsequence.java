package Greedy;

public class increasingtripletsubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i : nums){
            if(i<=first){
                first=i;
            }
            else if(i<=second){
                second=i;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums= {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }
}
