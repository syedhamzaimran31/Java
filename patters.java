class patterns{
    public static void main(String[] args) {


        // for (int i = 1; i <= rows; i++) {
        //     // white spaces in the front of the numbers
        //     int numberOfWhiteSpaces = rows - i;
    
        //     //print leading white spaces
        //     printString(" ", numberOfWhiteSpaces);
    
        //     //print character
        //     printString("* ", i);
    
        //     //move to next line
        //     System.out.println("");
        // }




        // int i, j;
        // int n=5;
        
        // for(i=n; i>0; i--)
        // {
 
        //     for(j=1; j<=i; j++)
        //     {
        //         System.out.print("* ");
        //     }
 
        //     System.out.println();
        // }

        //  full pyramid
        
      
                int n=5;
                // outer loop to handle number of rows
                //  n in this case
                for (int i=0; i<n; i++)
                {
         
                    // inner loop to handle number spaces
                    // values changing acc. to requirement
                    for (int j=n-i; j>1; j--)
                    {
                        // printing spaces
                        System.out.print(" ");
                    }
          
                    //  inner loop to handle number of columns
                    //  values changing acc. to outer loop
                    for (int j=0; j<=i; j++ )
                    {
                        // printing stars
                        System.out.print("* ");
                    }
          
                    // ending line after each row
                    System.out.println();
                }
            }
   }
    /*               *                          *
                    * *                        **
                   * * *                      ***
                  * * * *                    ****   
    
    
    */   


