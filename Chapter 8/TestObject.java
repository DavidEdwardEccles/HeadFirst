public class TestObject {
    public static void main(final String[] args) {
        final Dog a = new Dog();
        final Cat c = new Cat();

    if (a.equals(c)) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}
}