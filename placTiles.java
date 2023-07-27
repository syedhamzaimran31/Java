public class placTiles {
    // The same program can be done with dynamic programming with better Time
    // Complexity
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vretical placements of Tile:
        int verticalPlacement = placeTiles(n - m, m);
        // horizontal placement of Tiles
        int horizontalPlacement = placeTiles(n - 1, m);
        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int totalWays = placeTiles(n, m);
        System.out.println("Total ways = " + totalWays);
    }
}
