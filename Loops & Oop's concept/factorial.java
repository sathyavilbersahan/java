public class factorial {

    public static void main(String[] args) {

        int number = 6;
        int num = 1;
        for (int i = 1; i <= 6; i++) {
            num = num * i;
        }
        System.out.println("Factorial of " + number + " is: " + num);
    }
}