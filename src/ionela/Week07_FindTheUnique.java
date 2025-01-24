package ionela;

import java.util.HashMap;
import java.util.Map;

//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
public class Week07_FindTheUnique {
    public static void main(String[] args) {

        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println( findUnique2("AAABBBCCCDEF"));


    }
    public static String findUnique(String given){
        String result ="";

        for(int i=0; i<given.length(); i++) {
            int count = 0;
            char each = given.charAt(i);
            for (int j = 0; j < given.length(); j++) {
              if (each==given.charAt(j)){
                  count++;
              }
            }
            if(count==1){
                result+=each;
            }
        }
        return result;
    }
    public static String findUnique2(String given){
        String result="";
        Map<Character, Integer> resul = new HashMap<>();
        for(int i=0; i<given.length(); i++) {
            char each = given.charAt(i);
            resul.put(each, resul.getOrDefault(each, 0)+1);
        }

        for(int i=0; i<given.length(); i++) {
            char each = given.charAt(i);
            if (resul.get(each)==1){
                result+=each;

            }
        }

        return result;

    }
}
