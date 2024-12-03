package basir;

public class week03_task_swap_numbers {

    public static void main(String[] args) {

        //Numbers – Swap Numbers
        //Swap two variables' values without using a third variable.

        int a = 2;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("==================================");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
