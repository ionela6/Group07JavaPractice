package ionela;
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/
public class Week03_swapNumbersTask {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        num2 = num1+num2;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);




    }
}
