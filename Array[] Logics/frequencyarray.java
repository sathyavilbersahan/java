public class frequencyarray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 2, 1, 1, 2, 2, 3 };
        int frequency = 0, target = 2;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                frequency++;
            }
        }
        System.out.println("The frequency of the number is " + frequency);
    }
}
