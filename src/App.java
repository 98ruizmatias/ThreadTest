import java.util.concurrent.Semaphore;


public class App {
    public static void mani(String[]args) throws InterruptedException {

        Semaphore x = new Semaphore(1);
        Semaphore y = new Semaphore(0);

        ThreadA ta = new ThreadA(x,y);
        ThreadB tb = new ThreadB(x,y);

        ta.start();
        tb.start();

        ta.join();
        tb.join();

    }
}
