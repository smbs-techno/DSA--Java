package Arrays;

public class trappingrainwater {
    public static int trap(int[] height) {
        int n=height.length;
        int[] right=new int[n];
        int[] left=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] h={2,1,4,3,8,5,3,4,6,10,2,3,5,1};
        System.out.print(trap(h));
    }
}
