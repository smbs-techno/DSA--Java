package Arrays.Arrays.Subarrays; 
import java.util.*;
public class distinctelementsinwindow {
    public static void main(String[] args) {
            int[] arr={-2 ,-4, -2, 4, -2};
            int n=arr.length;
            int k=3;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<k;i++){
               map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            System.out.print(map.size()+" ");
            for(int i=k;i<n;i++){
                map.put(arr[i-k],map.get(arr[i-k])-1);
                if((map.get(arr[i-k])==0)){
                    map.remove(arr[i-k]);
                }
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

                System.out.print(map.size() + " ");
            }
            System.out.println();

        }
        
    }

