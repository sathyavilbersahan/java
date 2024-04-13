
class maximumsubarray {
    public static void main(String[] args) {
        int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxsumarray(num));
    }

    public static int maxsumarray(int[] num) { // maxsumarray is a keyword
        int sum = 0;
        int max_sum = 0; // num 1st value is -2 soo we taking 0
        for (int i = 0; i < num.length; i++) // .length is a keyword
        {
            sum = sum + num[i];
            if (sum > max_sum) // in this line we can use greater than > symbol because we need greater value
                // if need smaller value we can use < symbol
                max_sum = sum;
            if (sum < 0)
                sum = 0;

        }
        return max_sum;

    }

}