package Arrays.Arrays.Subarrays;

public class repeatingandmissingnumber {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(final int[] A) {
        long sum=0;
        long sqsum=0;
        for(int i : A){
            sum+=(long) i;
            sqsum+=(long) i*i;
        }
        int n=A.length;
        long esum=(long) n*(n+1)/2;
        long esqsum=(long) n*(n+1)*(2*n+1)/6;
        long diff=esum-sum;
        long sqdiff=esqsum-sqsum;
        long sumxy=sqdiff/diff;
        int m=(int) (diff+sumxy)/2;
        int r=(int) sumxy-m;
        int[] arr=new int[2];
        arr[0]=r;
        arr[1]=m;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] arr2=repeatedNumber(arr);
        for(int i=0;i<2;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
