public class sametree {
    public static void main(String[] args) {
        int[] p = { 2, 1, 2 };
        int[] q = { 2, 2, 1 };
        System.out.println(issametree(p, q));
    }

    public static boolean issametree(char tree p,tree q) 
    {
        if (p == null & q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return (p.sametree(p.left, p.right)) && (q.sametree(q.left, q.right));
        }
        return false;
    }
}
}