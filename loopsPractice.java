public class loopsPractice {
        public static void main(String[] args) {
            // //For loop
            // for(int i=0; i<100; i++){//i++ =i + 1
            //     System.out.println("Hamza");
            // }
            
            //while loop
            // int i=100;
            // while( i < 100 ){
            //     System.out.println("Hamza");
            //     i++;
            // }
            //do while loops
            //     int i=100;
            // do{
            //     System.out.println("Hamza");
            //     i++;
            // }while( i < 100 );

                //program to print the sum of first n Natural numbers

                int sum=0;
                for(int i=0; i<10; i++){
                    sum += i;
                }
                System.out.println("The sum of First N natural numbers is : "+sum);

                int mul=7;
                for(int i=1; i<11; i++){
                    // int answer=mul *  i;
                    // System.out.println("The table is given as : "+answer);
                    System.out.println(mul*i);
                }
              
            }
}
