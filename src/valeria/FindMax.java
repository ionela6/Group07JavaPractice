package valeria;

public class FindMax {


        public static void main(String[] args) {
            int [] arrayOfNumber = {1,500,60,7,50,999,400};
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



