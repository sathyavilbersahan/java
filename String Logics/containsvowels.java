
public class containsvowels {
    public static void main(String[] args) {

        String x = "The characters really contains vowels";
        x = x.replaceAll(" ", "");
        int vowels = 0, consonant = 0;

        for (int i = 0; i < x.length(); i++) {
            {
                if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i'
                        || x.charAt(i) == 'o'
                        || x.charAt(i) == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("The number of vowels are " + vowels);
        System.out.println("The number of consonant are" + consonant);

    }
}
