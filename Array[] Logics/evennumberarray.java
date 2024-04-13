public class evennumberarray {
    public static void main(String[] args) {
        int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("The even numbers are");
        for (int i = 1; i < num.length; i = i + 2) {
            System.out.println(num[i]);
        }
    }
}
