package ionela;
//Write a method that can find the maximum number from an int Array



public class Week10_FindMaximum {
    public static void main(String[] args) {
        int maximum = findMaximum(new int[]{1, 8, 3, 5, 0});
        System.out.println("maximum = " + maximum);
    }
    public static int findMaximum(int[] given){
        int maximum = given[0];
        for (int i = 1; i < given.length; i++) {
            if (given[i]>maximum){
                maximum=given[i];
            }
        }

        return maximum;
    }
}
