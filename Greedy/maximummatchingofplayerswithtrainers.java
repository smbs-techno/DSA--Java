package Greedy;

import java.util.Arrays;

public class maximummatchingofplayerswithtrainers {
     public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
       Arrays.sort(players);
       Arrays.sort(trainers);
       int i=0,j=0,count=0;
       while(i<players.length && j<trainers.length){
        if(trainers[j]>=players[i]){
            i++;
            j++;
            count++;
        }
        else j++;
       }
       return count;
    }
    public static void main(String[] args) {
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }
}
