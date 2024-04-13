public class doublereverse {

    public static void main(String[] args, int num) {

        System.out.println(num);
    }

    public static boolean afterreversal(int num) {
        int number = 90;
        if (num <= 9)
        //
        {
            return true;
        }
        if (num % 10 == 0) {
            return false;
        }
        return true;

    }
}
