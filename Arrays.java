class Arrays{
    public static void main(String[] args) {

        int[] myArray={1,2,3,4,5};

        // for (int i = 4; i >= 0; i--) {
        //     System.out.println(myArray[i]);

        // }

        // int j=4;        
        // do{
        //         System.out.println(myArray[j]);
        //         j--;
        //     } while(j>=0);
        
        // int k=0;
        // while(k<=3){
        //     k++;
        //     System.out.println(myArray[k]);
            
        // }
    // for(int a : myArray){
    //     System.out.println(a);
    // }

    // int myNumbers[][] = { {1, 2, 3, 4}, {5, 6, 7},{12,3,4,7,8},{0,10,100} };
    //     myNumbers[0][3]=19;

    // System.out.println(myNumbers[0][3]);
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} ,{9,8,7}};

        System.out.println(myNumbers.length);
        
    for (int i = 0; i < myNumbers.length; ++i) {

      for(int j = 0; j < myNumbers[i].length; ++j) {
        
        System.out.println(myNumbers[i][j]);    //myNumbers[2][0]
      }

    }
    }
}