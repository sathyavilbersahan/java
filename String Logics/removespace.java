public class removespace {
    public static void main(String[] args) {
        String vilber = "Say No To Space";
        vilber = vilber.replaceAll(" ", "");
        System.out.println("String after removing spaces are " + vilber);
    }
}
// replaceAll is used to replace oneword to another word