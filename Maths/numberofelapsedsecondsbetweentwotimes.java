package Maths;
public class numberofelapsedsecondsbetweentwotimes{
    public static int secondsBetweenTimes(String startTime, String endTime) {
        int hst=Integer.parseInt(startTime.substring(0,2))*3600;
        int mst=Integer.parseInt(startTime.substring(3,5))*60;
        int sst=Integer.parseInt(startTime.substring(6));
        int st=hst+mst+sst;
        int het=Integer.parseInt(endTime.substring(0,2))*3600;
        int met=Integer.parseInt(endTime.substring(3,5))*60;
        int set=Integer.parseInt(endTime.substring(6));
        int et=het+met+set;
        int ans=et-st;
        return ans;
    }
    public static void main(String[] args) {
        String startTime = "12:34:56";
        String endTime = "13:00:00";
        System.out.print(secondsBetweenTimes(startTime,endTime));
    }
}