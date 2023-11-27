import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(201) - 100;
        }
        while (calcSumArray(array) != 0) {
            for (int i = 0; i < array.length; i++) {
                int number;
                do {
                    number = rd.nextInt(201)-100;
                }while (isElementExist(array, number));
                array[i] = number;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static boolean isElementExist(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    private static int calcSumArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

        }
        return result;

    }
}
