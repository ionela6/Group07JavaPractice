package sezim;

public class Week10_FindMaximum {
    /*
    //Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

    int [] arr = {5, 7, 3, 4, 2};
        System.out.println(maxNum(arr));


    }
    public static int maxNum(int[]arr){

        int max =arr[0];

        for(int each : arr){
            if(each>max){
                max =each;
            }
        }
        return max;

    }
}
