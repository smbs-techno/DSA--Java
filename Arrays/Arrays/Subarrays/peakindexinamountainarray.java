package Arrays.Arrays.Subarrays;

public class peakindexinamountainarray {
     public static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid==0 && arr[mid]<arr[mid+1]) return mid+1;
            if(mid==n-1 && arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
