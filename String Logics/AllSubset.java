public class AllSubset {
    public static void main(String[] args) {
        String data = "FUN";
        for (int i = 0; i < data.length(); i++) {
            for (int j = i + 1; j <= data.length(); j++) {
                System.out.println(data.substring(i, j));
            }
        }
    }
}
