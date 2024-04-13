public class PrintingMethod {
    public static void main(String[] args) {
        String name = "sathya vilber";
        int age = 22;
        double weight = 85;
        float height = -5.9f;

        System.out.printf("%4s", name);

        System.out.printf("%4d", age);

        System.out.printf("My weight is %2f", weight);

        System.out.printf("My Height maybe %+2f", height);
    }
}