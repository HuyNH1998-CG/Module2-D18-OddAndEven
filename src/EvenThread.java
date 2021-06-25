public class EvenThread implements Runnable {
    private Thread thread;

    public EvenThread() {
        thread = new Thread(this, "A Thread");
        System.out.println("Created Even thread");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0 && i != 0) {
                    System.out.println(i + "  Even");
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
