package Module4;

public class StaticExample {
    static int count = 0;

    StaticExample() {
        count++;
    }

    static void display() {

        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
        new StaticExample();
        StaticExample.display();
    }
}