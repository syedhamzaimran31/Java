public class countingPaths {
    
    public static int countpaths(int i, int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if( i==n-1 && j==m-1){
            return 1;
        }
        //rows increasing
        int downpath=countpaths(i+1, j, n, m);
        //columns increasing
        int rightpath=countpaths(i, j+1, n, m);

        return downpath+rightpath;
    }
    
    public static void main(String[] args) {
        int n=4;
        int m=4;
        int finalPaths=countpaths(0, 0, n, m);
        System.out.println("total paths = "+ finalPaths);
    }
}
