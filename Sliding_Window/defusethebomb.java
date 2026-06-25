package Sliding_Window;

public class defusethebomb {
    public static int[] decrypt(int[] code, int k) {
        int[] ans=new int[code.length];
        int sum=0;
        int count=0;
        if(k==0) return ans;
        for(int i=0;i<code.length;i++){
            if(k>0){
                sum=0;
                int j=i+1;
                count=0;
                while(count!=k){
                    sum+=code[j%code.length];
                    j++;
                    count++;
                }
                ans[i]=sum;
            }
            else if(k<0){
                sum=0;
                int j=i-1;
                count=0;
                while(count<-k){
                    sum+=code[(j+code.length)%code.length];
                    j--;
                    count++;
                }
                ans[i]=sum;
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] code={5,7,1,4};
        int k = 3;
        int[] ans=decrypt(code,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
