package humaira;

public class week_03task_solution {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        System.out.println(" a =" + a + " b = " + b); // before

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a = " + a + " b = " + b);//after


    }
}
