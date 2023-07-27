public class findNumberofWays {
    public static int numberofWays(int n) {

        // BASE CASE
        if (n <= 1) {
            return 1;
        }

        // BODY
        // way1:
        int way1 = numberofWays(n - 1);
        // way2:
        int way2 = (n - 1) * numberofWays(n - 2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n=3;
        int totalWays=numberofWays(n);
        System.out.println("Total ways : " + totalWays);

    }
}
