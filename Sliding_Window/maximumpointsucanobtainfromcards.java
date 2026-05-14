package Sliding_Window;

public class maximumpointsucanobtainfromcards {
    public static int maxScore(int[] cardPoints, int k) {
       int lsum=0;
       int rsum=0;
       int maxsum=0;
       for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
       }
       maxsum=lsum;
       int rightIndex=cardPoints.length-1;
       for(int i=k-1;i>=0;i--){
        lsum=lsum-cardPoints[i];
        rsum=rsum+cardPoints[rightIndex];
        rightIndex--;
        maxsum=Math.max(maxsum,lsum+rsum);
       }
       return maxsum;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,1};int k = 3;
        System.out.print(maxScore(a, k));
    }
}
