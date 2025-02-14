package ionela;
/*Write a method that can move all the zeros to  last indexes of the array
     (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
*/


import java.util.Arrays;

public class week11_MoveZeroesToTheEnd {
    public static void main(String[] args) {
        System.out.println("result = " + zeroesToTheEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0}));

    }

    public static String zeroesToTheEnd(int[] given){

        int[] result = new int[given.length];
        int indexOfNonZeroItems = 0;
        for (int each : given) {
            if (each!=0){
                result[indexOfNonZeroItems]=each;
                indexOfNonZeroItems++;
            }
        }
return Arrays.toString(result);


    }
}


