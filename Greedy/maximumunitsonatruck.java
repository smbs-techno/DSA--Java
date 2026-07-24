package Greedy;
import java.util.*;
public class maximumunitsonatruck{
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return b[1]-a[1];
        });
        int count=0;
        int sum=0;
        for(int i=0;i<boxTypes.length;i++){
            if(count+boxTypes[i][0]<=truckSize){
                sum+=boxTypes[i][0]*boxTypes[i][1];
                count+=boxTypes[i][0];
                continue;
            }
            else{
                int rem = truckSize-count;
                sum+=rem*boxTypes[i][1];
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
}