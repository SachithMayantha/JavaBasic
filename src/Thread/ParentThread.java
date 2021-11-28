package Thread;

public class ParentThread {
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            System.out.println("Parent Thread "+i);
        }
        ChildThread childThread = new ChildThread();
        Thread thread = new Thread(childThread);
        thread.start();
    }
}
