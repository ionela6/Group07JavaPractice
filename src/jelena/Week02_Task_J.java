package jelena;

public class Week02_Task_J {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("finra");

            } else if (i % 5 == 0) {
                System.out.println("ra");

            } else if (i % 3 == 0) {
                System.out.println("fin");

            } else {
                System.out.println(i);
            }
        }

    }
}
    


/*
    QUESTION 2- Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */