public class backTracking {
    // Program to print Permutations
    // Time complexity of program is Total steps to find the all answers -> [
    // (n*n!)=(3*3!)=18] while total ansers will be (n!)=(3!)=6
    public static void permutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, perm + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutations(str, "");
    }
}
