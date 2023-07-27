class removingDuplicates{
        public static boolean map[]=new boolean[26];
        public static void removeDuplicates(int index,String str,String newStr){
                
                 
                if(index==str.length()){
                    System.out.println(newStr);
                    return;
                }
                char currChar=str.charAt(index);
                if(map[currChar -'a']){
                    removeDuplicates(index+1, str, newStr); 
                }else{
                    newStr+=currChar;
                    map[currChar-'a']=true;
                    removeDuplicates(index+1, str, newStr);
                }



        }
    
    public static void main(String[] args) {
        String str="asasdasdasdasf";
        removeDuplicates(0, str, "");
    }
}