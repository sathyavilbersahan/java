public class Righttriangle {
    public static void main(String[] args) {
        int a, b, row = 6;
        for (a = 0; a < row; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
