package jelena;

public class Week03_SwapVariables {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        num1 += num2;
        num2 = num1-num2;
        num1 = num1- num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }

}
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/