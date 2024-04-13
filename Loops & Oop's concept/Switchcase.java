public class Switchcase {
    public static void main(String[] args) {
        String name = "vilber";
        int age = 23;
        Float height = 5.8f;
        double weight = 85.5;
        switch (2) {
            case 1:
                System.out.println(name);
                break;
            case 2:
                System.out.println(age);
                break;
            case 3:
                System.out.println(height);
                break;
            default:
                System.out.println(weight);
        }
    }
}