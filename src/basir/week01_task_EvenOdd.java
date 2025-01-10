package basir;

public class week01_task_EvenOdd {

    public static void main(String[] args) {

        System.out.println(OddorEven(11));
        System.out.println(OddorEven(6));
    }

    public static String OddorEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}




