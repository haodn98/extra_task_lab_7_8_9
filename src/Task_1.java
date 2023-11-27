import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
//        possible to use String, but in case we ll make lots of concatenation operations StringBuilder is more effective
//        String result = new String();
        System.out.println("Input your number ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                result.append("+");
            } else {
                result.append("-");
            }
        }
        System.out.println(result);
    }
}
