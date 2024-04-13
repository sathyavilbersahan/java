import java.util.Arrays;

public class longestcommonprefix {
    public static void main(String[] args) {
        String strs[] = { "flight", "flow", "flower" };
        System.out.println(longestcommonprefix(strs));
    }

    public static String longestcommonprefix(String strs[]) {
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[2];
        int num = 0;
        while (num < strs1.length() - 1) {
            if (strs1.charAt(num) == (strs2.charAt(num))) {
                num++;
            } else {
                break;
            }
        }
        return num == 0 ? "" : strs1.substring(0, num);
    }
}
