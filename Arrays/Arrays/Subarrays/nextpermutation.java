package Arrays.Arrays.Subarrays;
public class nextpermutation {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    static void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,nums.length-1); 
        }
        else{
            for(int i=n-1;i>p;i--){
                if(nums[i]>nums[p]){
                    swap(nums,i,p);
                    break;
                }
            }
            reverse(nums,p+1,nums.length-1);
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,2};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}