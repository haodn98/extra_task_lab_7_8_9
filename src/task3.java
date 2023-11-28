
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        if (n % 2 != 0) {
            array[n / 2] = 0;
        }
        for (int i = 0; i < (array.length)/2; i++) {
            array[i] = i + 1;
            array[(array.length - 1) - i] = -(i + 1);
        }
        System.out.println(calcSumArray(array));
        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    private static int calcSumArray(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;

    }
}
