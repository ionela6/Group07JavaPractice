package alireza;

public class Week10_Array_FindMaxNumber {
    public static void main(String[] args) {
        int [] arrayOfNumber = {1,300,20,7,50,6,400,9,8};
        int maxNumber = 0 ;

        for (int i = 0; i < arrayOfNumber.length; i++) {
            if(arrayOfNumber[i]> maxNumber){
                maxNumber = arrayOfNumber[i];
            }
        }
        String result = "The Max number of this Array is Number  : "+ maxNumber;
        System.out.println("result = " + result);
    }
}
