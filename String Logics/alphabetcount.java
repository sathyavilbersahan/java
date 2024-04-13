public class alphabetcount {
    public static void main(String[] args) {
        String var = "bangalore 560075";
        for (int i = 0; i < var.length(); i++) {

        }
        System.out.println(var.replaceAll("[a-zA-Z]", " "));
    }
}
