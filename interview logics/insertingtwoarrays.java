public class insertingtwoarrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9 };
        int[] temp = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i]; // in this statement this loop execute first and print {1,2,3,4,5}
        }
        for (int i = 0; i < arr2.length; i++) {
            temp[arr1.length + i] = arr2[i]; // then arr1.length is 5 and +1 = 6 then arr1.length+1=6
            // temp[arr1.length+1]=6then arr2 0 index is 6 // 6 = 6 true
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }
    }
}
