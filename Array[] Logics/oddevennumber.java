public class oddevennumber {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("the odd numbers are");
        for (int i = 0; i < num.length; i = i + 2) {
            System.out.println(num[i]);
        }
        System.out.println("the even numbers are");
        for (int j = 1; j < num.length; j = j + 2) {
            System.out.println(num[j]);
        }
    }
}
