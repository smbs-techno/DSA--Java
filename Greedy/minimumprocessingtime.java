package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumprocessingtime {
    public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks,Collections.reverseOrder());
        int max=Integer.MIN_VALUE;
        for(int i=0;i<processorTime.size();i++){
            int pTime=processorTime.get(i);
            int largeTask=tasks.get(i*4);
            max=Math.max(max,largeTask+pTime);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> pt=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        pt.add(8);
        pt.add(10);
        t.add(2);
        t.add(2);
        t.add(3);
        t.add(1);
        t.add(8);
        t.add(7);
        t.add(4);
        t.add(5);
    }
}
