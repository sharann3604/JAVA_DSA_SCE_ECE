package Module5;
class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        LifeCycle t = new LifeCycle();
        System.out.println("Thread State: " + t.getState()); // NEW
        t.start();
        System.out.println("Thread State after start: " + t.getState());
    }
}