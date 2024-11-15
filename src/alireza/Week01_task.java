package alireza;

public class Week01_task {
    public static void main(String[] args) {
        oddOrEven(11);
    }
    public static void oddOrEven(int num){
        if (num % 2 == 0 ){
            System.out.println("number "+num+" is Even.");
        }else {
            System.out.println("number "+num+" is Odd.");
        }
    }
}
