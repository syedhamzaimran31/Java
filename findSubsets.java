import java.util.*;

class findSubsets {

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
             System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // adding subset
        subset.add(n);
        findSubset(n - 1, subset);

        // removing subset
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

    }
}