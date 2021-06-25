public class OddThread implements Runnable {
    private Thread thread;

    public OddThread() {
        thread = new Thread(this, "A Thread");
        System.out.println("Created Odd thread");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(i + "  Odd");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
