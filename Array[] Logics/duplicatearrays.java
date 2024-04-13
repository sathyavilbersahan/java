public class duplicatearrays {
    public static void main(String[] args) {
        int[] num = new int[] { 1, 2, 3, 4, 2, 3, 4 };
        int temp;
        System.out.println("Duplicate numbers is");

        for (int i = 0; i < num.length; i++) { // 0+1=1
            for (int j = i + 1; j < num.length; j++) { // i+1(1+1=2) ;2<1; 2+1=3;
                if (num[i] == num[j]) { // num[i] == num[j](3)
                    temp = num[i];
                    System.out.println(num[i]);
                }
            }
        }
    }
}
