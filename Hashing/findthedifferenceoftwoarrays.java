package Hashing;
import java.util.*;
public class findthedifferenceoftwoarrays{
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        List<Integer> n1=new ArrayList<>();
        for(int i : set){
            n1.add(i);
        }
        list.add(n1);
        set.clear();
        for(int i : nums2){
            set.add(i);
        }
        for(int i : nums1){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        List<Integer> n2=new ArrayList<>();
        for(int i : set){
            n2.add(i);
        }
        list.add(n2);
        return list;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        List<List<Integer>> list=findDifference(nums1, nums2);
        System.out.print(list);
    }
}