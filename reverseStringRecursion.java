public class reverseStringRecursion {
            
    
    
                 // Print Reverse String Using Recursion
//     public static void reverseString(String name , int index){
//        if(index==0){
//         System.out.println(name.charAt(index));
//         return;
//        }
//        System.out.print(name.charAt(index));
//        reverseString(name, index-1);

       
       
//     }
//     public static void main(String[] args) {
//         String name="Hamza";
//         reverseString(name, name.length()-1);
//     }
                    //Program to find occurence of element.
                    //Time complexity of the program is O(n)[equal to the length of the string].
    // public static int first=-1;
    // public static int last=-1;

    // public static void findOccurence(int index,String str, char element){
    //     if(index==str.length()){
    //         System.out.println( "First occurnece:" +first);
    //         System.out.println("Last occurence:" +last);
    //         return;
    //     }
        
        
        
    //     if(str.charAt(index)==element){
    //         if(first==-1){
    //             first=index;
    //         }   else{
    //             last=index;
    //         }
    //     }

    //     findOccurence(index+1, str, element);
    // }

    // public static void main(String[] args) {
    //    String str="adsjhgoaskakiyuuhal";
    //    findOccurence(0, str, 'a');
        
    // }
            //Checking if an Array is Sorted or Unsorted
            //Time complexity of the Program is O(n)[which is equals to the length of the array.]
            public static boolean checkIfSorted(int arr[], int index){
            if(index==arr.length-1){
                System.out.println("Array is Sorted");
                return true;
            }
            if(arr[index]>=arr[index+1]){
                System.out.println("Array is not Sorted");
                return false;
            } else {
                return checkIfSorted(arr, index+1);
            }
        }
        public static void main(String[] args) {
                int arr[]={1,3,16,7,9,11,13,17,19};
                checkIfSorted(arr, 0);
            }

}
