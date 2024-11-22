package ionela;

public class Week01_task01_id {
    public static void main(String[] args) {

        identify(2);
        identify(5);


    }
    public static void identify(int num){
        if (num%2==1){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }
}
