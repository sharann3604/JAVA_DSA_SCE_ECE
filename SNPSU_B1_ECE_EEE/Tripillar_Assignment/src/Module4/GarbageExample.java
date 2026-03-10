package Module4;
public class GarbageExample {

    protected void finalize() {

        System.out.println("The garbage collected");
    }

    public static void main(String[] args) {
        GarbageExample obj1 = new GarbageExample();
        GarbageExample obj2 = new GarbageExample();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}