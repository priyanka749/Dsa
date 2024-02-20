package Two;

public class Two_a {

    public static int minMove(int[] machines) {
        int totalclothes = 0;
        int numOfMachine = machines.length; //machine ko length calculate  length of machine

        // calculate number of length
        for (int Clothes : machines) {
            totalclothes += Clothes;
        }

        // equally distribute 
        if (totalclothes % numOfMachine != 0) {
            return -1; 
        }

        // how much clothes contain in a machine
        int ClothesPerMachine = totalclothes / numOfMachine;


        int moves = 0; //inital  
        for (int i = 0; i < numOfMachine - 1; i++) {
            int diff = ClothesPerMachine - machines[i];
            if (diff > 0) {
                int shift = Math.min(diff, machines[i + 1]);//number of clothes update
                machines[i] += shift;
                machines[i + 1] -= shift;
                
                moves += shift;
            }
        }

        return moves;
    }
    public static void main(String[] args) {
        int[] input = { 1, 0, 5 };
        System.out.println(minMove(input) + " is the kam number of move to shift clothes");
    }
}