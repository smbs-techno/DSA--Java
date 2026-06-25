package Maths;
public class anglebetweenhandsofaclock {
    public static double angleClock(int hour, int minutes) {
        double ans=Math.abs(30*hour-(5.5*minutes));
        double ans1=Math.min(ans,360-ans);
        return ans1;
    }
    public static void main(String[] args) {
        System.out.print(angleClock(12, 30));
    }
}
