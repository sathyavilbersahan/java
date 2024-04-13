public class Addelementarray {
    public static void main(String[] args) {
        int[] num = { 2, 3, 6, 7, 9 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("the number of elements added in array" + " " + sum);

    }
}
