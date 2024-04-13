public class SquareRoot {
    public static void main(String[] args) {
        int num = 49;
        int key = 1;
        while (key <= num / 2) {
            int temp = num / key;
            if (key == temp) {
                System.out.println(num + " is the root of " + temp);
            }
            key++;
        }
    }
}
