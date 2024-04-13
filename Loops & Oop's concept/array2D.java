public class array2D {
    public static void main(String[] args) {
        String[][] phones = new String[3][3];

        phones[0][0] = "redmi";
        phones[0][1] = "oppo";
        phones[0][2] = "realme";
        phones[0][3] = "apple";
        phones[1][1] = "blackberry";
        phones[1][2] = "lenovo";
        phones[1][3] = "nokia";
        phones[2][1] = "infinix";
        phones[2][2] = "vivo";
        phones[2][3] = "samsung";

        for (int i = 0; i < phones.length; i++) {
            System.out.println();
            for (int j = 0; j < phones[i].length; j++) {
                System.out.println(phones[j][i]);
            }

        }

    }
}