
import java.util.*;
public class findmissingelements {
    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> miss=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        for(int i : nums){
            while(min<i){
                miss.add(min);
                min++;
            }
            min=i+1;
        }
        return miss;
    }
    public static void main(String[] args) {
       int[] nums = {5,1};
       List<Integer> list = findMissingElements(nums);
       System.out.println(list);
    }
}
