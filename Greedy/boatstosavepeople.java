package Greedy;

import java.util.Arrays;

public class boatstosavepeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit) i++;
            j--;
            boat++;
        }
        return boat;
    }
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.print(numRescueBoats(people, limit));
    }
}
