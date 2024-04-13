public class duplicatecharacter {
    public static void main(String[] args) {
        String var = "mighty guy";
        char[] temp = var.toCharArray();
        for (int i = 0; i < var.length(); i++) {
            for (int j = i + 1; j < var.length(); j++) {
                if (temp[i] == temp[j]) {
                    System.out.println(temp[i]);
                }
            }
        }

    }
}
