import java.util.*;
class MaxInFamily {
    static ArrayList<Integer> result = new ArrayList<>();
    public static int count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        ArrayList<Integer> y = maxInFamily(n, result);
        String res = "";
        y.sort(Collections.reverseOrder());
        for (Integer integer : y) {
            res += integer;
        }
        return Integer.parseInt(res);
    }

    public static ArrayList<Integer> maxInFamily(int i, ArrayList<Integer> res) {
        if (Integer.toString(i).length() == 1) {
            res.add(i);
            return res;
        }
        res.add(i % 10);
        res = (maxInFamily((i / 10), res));
        return res;
    }
}

public class Task4 {
    public static void main(String[] args) {
        int result = MaxInFamily.count();
        System.out.println(result);
    }
}

