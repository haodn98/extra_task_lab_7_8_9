public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
        System.out.println(repFirstChar("Test"));
        System.out.println(repFirstChar("1test"));
        System.out.println(repFirstChar("-test"));
    }

    private static String repFirstChar(String str) {
        char c = str.charAt(0);
        if ((int) c > 64 && (int) c <= 90) {
            return "upper";
        } else if ((int) c > 96 && (int) c <= 122) {
            return "lower";
        } else if ((int) c > 47 && (int) c <= 57) {
            return "digit";
        } else {
            return "other";
        }

    }


}
