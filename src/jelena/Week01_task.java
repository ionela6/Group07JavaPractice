package jelena;

public class Week01_task {
    public static void main(String[] args) {
        evenOrOdd(10);
        System.out.println(evenOrOdd(5));
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
             return "even";
        } else {
            return "odd";
        }
    }


}






















