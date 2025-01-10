package alireza;

public class Week03_SwapNumbers_Task {
    public static void main(String[] args) {
        // we have two int variable :
        int a = 20 ;
        int b = 10 ;
        System.out.println("orginal a : "+a+" \n" +
                "orginal b : "+b);

        //we are going to swap them without using any third variable :

        a = a + b ; // now a has a new value by adding a and b
        b = a - b ; // here we are swapping a original value of a to b
        a = a - b ; // here we are swapping a original value of b to a

        System.out.println("After swapping a and b : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
