package Module4;
final class Animal {
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
class FinalClassExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}

