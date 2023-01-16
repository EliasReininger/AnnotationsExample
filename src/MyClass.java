public class MyClass {
    static int count = 0;

    @Repeat(repeats = 5)
    public static void sayHello() {
        System.out.println("Hello there");
    }

    @Repeat
    public static void countUp() {
        System.out.println(++count);
    }


    public static void honorPHP() {
        System.out.println("PHP is a very nice language");
    }
}
