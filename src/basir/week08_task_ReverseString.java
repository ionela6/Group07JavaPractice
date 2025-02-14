package basir;

public class week08_task_ReverseString {

        //String reverse write a return method that can reverse string
        // Ex: reverse("ABCD"); ==> DCBA
        public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String word = "ABCD";
        String reversed = reverse(word);
        System.out.println("Reversed string: " + reversed);
    }

}
