public class MyThread extends Thread {
    private Thread thread;
    public MyThread(Thread thread, String name) {
        super(name);
        this.thread = thread;
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            if (thread != null) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            calculate();
    }
        static void calculate() {
            for(int i = 0; i < 20; i++){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
    }
}