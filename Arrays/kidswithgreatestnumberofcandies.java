import java.util.ArrayList;
import java.util.List;

public class kidswithgreatestnumberofcandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> c=new ArrayList<>();
        int max=0;
        for(int i : candies){
            max=Math.max(i,max);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                c.add(true);
            }
            else{
                c.add(false);
            } 
        }
        return c;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
