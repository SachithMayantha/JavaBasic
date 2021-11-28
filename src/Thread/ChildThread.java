package Thread;

public class ChildThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Child Thread "+i);
        }
    }
}
