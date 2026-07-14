package Greedy;

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
    
}
