public class reversestring {
    public static void main(String[] args) {
        String var = "vilber";
        System.out.println(reversethestring(var));
    }

    public static String reversethestring(String var) {

        StringBuilder ch = new StringBuilder(var);
        ch.reverse();
        return ch.toString();
    }
}
