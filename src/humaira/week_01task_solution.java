package humaira;

public class week_01task_solution {
    public static void main(String[] args) {



              System.out.println(identify(5));
              System.out.println(identify(6));

    }

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
//Write a method which identifies given number is even or odd
//
//Example :
//identify(5) -> output -> "Odd"
//identify(6) -> output -> "Even"