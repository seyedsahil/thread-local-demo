package demo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("[Main]");
        // User A logs in
        LoginThread A = new LoginThread("seyed");
        Thread.sleep(5000);
        // User B logs in after 5 seconds
        LoginThread B = new LoginThread("sahil");
        A.join();
        B.join();
        System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
    }

}
