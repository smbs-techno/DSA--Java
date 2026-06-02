package Arrays;
public class earliestfinishtimeforlandandwaterridesI{
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landfinish = landStartTime[i] + landDuration[i];
                int waterstart = Math.max(landfinish,waterStartTime[j]);
                int finish1 = waterstart + waterDuration[j];
                ans = Math.min(ans,finish1);
                int waterfinish = waterStartTime[j] + waterDuration[j];
                int landstart = Math.max(waterfinish,landStartTime[i]);
                int finish2 = landstart + landDuration[i];
                ans = Math.min(ans,finish2);
            }
        }
        return ans;
    }
        public static void main(String[] args) {
            int[] landStartTime = {2,8}; 
            int[] landDuration = {4,1}; 
            int[] waterStartTime = {6}; 
            int[] waterDuration = {3};
            System.out.print(earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration));
        }
    }