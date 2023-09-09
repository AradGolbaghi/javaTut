
public class GhostCode {
  public static String name = "Javatlacati";

  public static String helloName(final String name) {

    if (name == null || name.equals(""))
      return "Hello world!";
    else
      return "Hello my name is " + name;
  }

  public static void main(String[] args) {
    System.out.println(helloName(name));

  }
}