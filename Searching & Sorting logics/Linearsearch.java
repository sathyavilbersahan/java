public class Linearsearch {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int key = 40;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("the index of the key is " + i);
            }
        }
    }
}