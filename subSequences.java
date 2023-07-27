import java.util.HashSet;

class subSequences {

    // //The program is made to print all the subsequences of a string.
    // //Time Complexity of the program is O(2^n)
    // public static void subSequence(int index, String str, String newStr){

    // if(index==str.length()){
    // System.out.println(newStr);
    // return;
    // }

    // char currChar=str.charAt(index);

    // //to take string with Char.
    // subSequence(index+1, str, newStr+currChar);

    // //to take string without Char.
    // subSequence(index+1, str, newStr);
    // }

    // public static void main(String[] args) {
    // String str="aaa";
    // subSequence(0, str, "");

    // }




    // The program is made to print all the unique subsequences of a string.
    // Time Complexity of the program is O(2^n)
    public static void subSequence(int index, String str, String newStr, HashSet<String> set) {

        if (index == str.length()) {
            if(set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
            
        }

        char currChar = str.charAt(index);

        // to take string with Char.
        subSequence(index + 1, str, newStr + currChar,set);

        // to take string without Char.
        subSequence(index + 1, str, newStr,set);
    }

    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set=new HashSet<>();
        subSequence(0, str, "",set);

    }

}