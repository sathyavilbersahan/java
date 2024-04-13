public class swapingstringswithouttemp {
    public static void main(String[] args) {
        String var1 = "good";
        String var2 = "morning";
        var1 = var1 + var2; // good morning
        var2 = var1.substring(0, (var1.length() - var2.length())); // g,4-7=ood
        var1 = var1.substring(var2.length());
        System.out.println(var2 + " " + var1);
    }
}