import java.util.concurrent.Semaphore;


public class ThreadB extends Thread {
    private Semaphore x;
    private Semaphore y;
    public ThreadB(Semaphore x, Semaphore y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void num() throws InterruptedException {
        for (int i = 0;i < 1000 ; ++i ) {
            this.x.acquire();             //P(x)
            System.out.println("B");      //Region Criticas
            this.y.release();             //V(y)
        }
    }
}