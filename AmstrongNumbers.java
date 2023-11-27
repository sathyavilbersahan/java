public class AmstrongNumbers {
    public static void main(String[] args) {
        int num = 371;
        int ams = 0;
        int x = 0;
        int temp = num;

        while (temp > 0) {
            x = temp % 10;
            ams = ams + (x * x * x);
            temp = temp / 10;
        }
        if (ams == num) {
            System.out.println(num + " " + "is amstrong number");
        } else {
            System.out.println(num + " " + "is not amstrong number");
        }
    }
}
