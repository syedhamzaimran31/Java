class movingChar{


            //Moving specific Char of the String to the Last
            //Time Complexity of the Program is O(n)
    public static void movingX_ToLast(String str,String newStr,int count,int index){
        if(index==str.length()){
           for(int i=0; i<count; i++){
                newStr+='x';
           }
           System.out.println(newStr); 
            return;
        }

        if(str.charAt(index)=='x'){
            count++;
            movingX_ToLast(str, newStr, count, index+1);
        } else {
            newStr+=str.charAt(index);
            movingX_ToLast(str, newStr, count, index+1);
        }
    }




    public static void main(String[] args) {
        String str ="abcdxvbghdrxxtuyx";
        System.out.println(str.length());
        movingX_ToLast(str, "", 0, 0);
    }
}