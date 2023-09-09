public class Dinglemouse {

    public static String replaceDots(final String str) {
        return str.replace(".", "-");
    }

    public static void main(String[] args) {
        System.out.println(replaceDots(" . "));
    }
}