package valeria;


import java.util.Arrays;
public class week12 {
        public static int[] sort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {10, 9, 8, 7};
            arr = sort(arr);


            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

