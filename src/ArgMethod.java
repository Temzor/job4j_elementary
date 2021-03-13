public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Dmitrii Kapustin";
        int age = 32;

        ArgMethod.hello(name);

    }
}