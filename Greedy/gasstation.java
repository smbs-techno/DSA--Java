package Greedy;

public class gasstation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_cost>total_gas) return -1;
        int start=0;
        int curr_gas=0;
        for(int i=0;i<gas.length;i++){
            curr_gas+=gas[i]-cost[i];
            if(curr_gas<0){
                curr_gas=0;
                start=i+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
