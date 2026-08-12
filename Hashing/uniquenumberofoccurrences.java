package Hashing;
import java.util.*;
public class uniquenumberofoccurrences{
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i : map.values()){
            if(set.contains(i)) return false;
            else set.add(i);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}