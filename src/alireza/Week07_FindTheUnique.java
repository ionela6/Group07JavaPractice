package alireza;

public class Week07_FindTheUnique {
    public static void main(String[] args) {
//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
        System.out.println(findTheUnique("AAABBBCCCDEF"));


    }
    public static String findTheUnique(String str){
        String unique = "";
        for (int i = 0; i <str.length() ; i++) {
            int countChar = 0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    countChar ++;
                }

            }
            if (countChar==1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }
}
