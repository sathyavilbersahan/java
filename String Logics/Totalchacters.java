
public class Totalchacters {
    public static void main(String[] args) {
        String vilber = "the world full of peace";
        int count = 0;
        for (int i = 0; i < vilber.length(); i++) {
            if (vilber.charAt(i) != ' ') {
                count++;
            }

        }
        System.out.println(" The total number of count in character is" + count);
    }
}
