class keyPad {
   public static String[] keyPad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };


   //The program is made to print all the possible combinations of keyppad.
   //Time complexity of the program is (string lenthe^n), i.e; (4^n)
    public static void keyPadfunction(int index, String str, String output) {
            if(index==str.length()){
                System.out.println(output);
                return;
            }

        char currChar = str.charAt(index);
        String mapping = keyPad[currChar - '0'];

                for(int i=0;i<mapping.length();i++){
                  keyPadfunction(index+1, str, output+mapping.charAt(i));
                }
            
    }

    public static void main(String[] args) {
        String str="3";
        keyPadfunction(0, str, "");



        
    }
}