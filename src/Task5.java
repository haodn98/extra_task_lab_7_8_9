public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
        System.out.println(repFirstChar("Test"));
        System.out.println(repFirstChar("1test"));
        System.out.println(repFirstChar("-test"));
    }

    private static String repFirstChar(String str) {
        char c = str.charAt(0);
        if(Character.isUpperCase(c)){
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        }else {
            return "other";
        }

    }


}
