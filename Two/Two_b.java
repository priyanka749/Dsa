package Two;

import java.util.ArrayList;
import java.util.List;

public class Two_b { // Class declaration for class Two_b
    public static void main(String[] args) {
        int n = 5; // Initializing variable n with value 5
        int[][] intervals = {{0, 2}, {1, 3}, {2, 4}};
        int firstPerson = 0; // Initializing variable firstPerson with value 0

       
        List<Integer> result = getPeopleWhoKnowSecret(n, intervals, firstPerson);
        System.out.println(result); // Printing the 'result' list
    }

    
    public static List<Integer> getPeopleWhoKnowSecret(int n, int[][] intervals, int firstPerson) {
        boolean[] knowsSecret = new boolean[n]; // Initializing a boolean array knowsSecret with size n
        knowsSecret[firstPerson] = true; // Marking the firstPerson as knowing the secret

        // Iterating through each interval
        for (int[] interval : intervals) {
            
            for (int i = interval[0]; i <= interval[1]; i++) {
                if (knowsSecret[i]) {
                    
                    for (int j = interval[0]; j <= interval[1]; j++) {
                        knowsSecret[j] = true;
                    }
                    break; 
                }
            }
        }

        List<Integer> result = new ArrayList<>(); // Initializing a new ArrayList to store the result

        for (int i = 0; i < n; i++) {
            if (knowsSecret[i]) {
                result.add(i);
            }
        }

        return result; 
    }
}
