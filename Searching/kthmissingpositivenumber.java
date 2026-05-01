 package Searching;
 public class kthmissingpositivenumber{
 public static int findKthPositive(int[] arr, int k) {
        // solution 1 (optimal (O(log n)))
       int low=0,high=arr.length-1;
       int mid;
       int missing;
       while(low<=high){
        mid=low+(high-low)/2;
        missing=arr[mid]-(mid+1);
        if(missing<k) low=mid+1;
        else high=mid-1;
       }
       return low+k; //return high+1+k(high+1=low) 
       
       
       

// solution 2(O(n))
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=k) k++;
        //     else break;
        // }
        // return k;


// solution 3 brute force(O(n+k))
        // HashSet<Integer> set=new HashSet<>();
        // for(int i : arr){
        //     set.add(i);
        // }
        // int m=k;
        // int idx=0;
        // int[] arr1=new int[k+arr.length];
        // for(int i=0;i<k+arr.length;i++){
        //     if(!set.contains(i+1)){
        //         arr1[idx++]=i+1;
        //     }
        // }
        // return arr1[k-1];
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11}; 
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}