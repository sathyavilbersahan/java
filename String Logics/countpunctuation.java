public class countpunctuation {
    public static void main(String[] args) {
        String vilber = "He said, 'The mailman loves you.' I heard it with my own ears.";
        int count = 0;
        for (int i = 0; i < vilber.length(); i++) {
            if (vilber.charAt(i) == ',' || vilber.charAt(i) == '.' || vilber.charAt(i) == '"'
                    || vilber.charAt(i) == ';') {
                count++;
            }

        }
        System.out.println("The number of punctuation present in a sentence is " + count);
    }
}
