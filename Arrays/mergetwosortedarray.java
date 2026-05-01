package Arrays;

import java.util.Arrays;

public class mergetwosortedarray{
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[Math.abs(m-i)];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,0,0,0};
        int m=3;
        int[] arr1={4,8,2};
        int n=3;
        int[] arr2=merge(arr,m,arr1,n);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}