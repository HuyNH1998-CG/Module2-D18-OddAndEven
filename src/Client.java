public class Client {
    public static void main(String[] args) {

        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.getThread().start();
        try {
            oddThread.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.getThread().start();

    }
}
