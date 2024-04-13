public class compareobjects {
    public static void main(String[] args) {
        Long x = new Long(123);
        Double y = new Double(123);

        Long z = new Long(124);
        Double q = new Double(123);

        boolean result = y.equals(q);
        System.out.println(result);
    }
}