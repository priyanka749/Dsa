package Two;

public class Two_a {

    public static int minMovesToEqualizeDresses(int[] sewingMachines) {
        int totalDresses = 0;
        int numMachines = sewingMachines.length;

        // Calculate the total number of dresses
        for (int dresses : sewingMachines) {
            totalDresses += dresses;
        }

        // Verify whether the whole number of dresses can be divided equally across the machines.
        if (totalDresses % numMachines != 0) {
            return -1; // If the total number of garments cannot be distributed evenly, cannot equalize
        }

        int averageDressesPerMachine = totalDresses / numMachines;
        int moves = 0;
        int cumulativeSum = 0;

        for (int dresses : sewingMachines) {
            cumulativeSum += dresses - averageDressesPerMachine;
            moves = Math.max(moves, Math.abs(cumulativeSum));
        }

        return moves;
    }

    public static void main(String[] args) {
        int[] sewingMachines = { 1,0,5};
        System.out.println(minMovesToEqualizeDresses(sewingMachines));
    }
}