public class factorialnumber {
    public static void main(String[] args) {
        int num = 1, number = 5;

        for (int i = 1; i <= number; i++) {
            num = num * i;
        }
        System.out.println("factorial of" + " " + number + "is" + " " + num);
    }
}
