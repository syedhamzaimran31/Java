import java.util.*;
import java.util.Scanner;
public class arraysPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int size;
        // System.out.println("Enter the size of your array :");
        // size=sc.nextInt();
        // String names[]=new String[size];
       
        // System.out.println("Enter the names in your array :");

        // for(int i=0; i<size; i++){
        //     names[i]=sc.next();
        // }

        // for(int i=0; i<size; i++){
        //     System.out.println(names[i]);
        // }
    
    
            //Finding Specific number in array and printing its index(input by user).
            int size;
            size=sc.nextInt();
            int numbers[]=new int[size];
            //taking input from user
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();
            }
            int x;
            x=sc.nextInt();
            //checking for x
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==x){
                    System.out.println("The value found at index =" + i);
                }

            }
    }
}
