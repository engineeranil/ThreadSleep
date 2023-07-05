public class Main {
    public static void main(String[] args) {
        Counter c1  = new Counter("COUNTER1",1);
        Counter c2 = new Counter("COUNTER2",2);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        try {
            Thread.sleep(3000L);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        c1.stop();

    }
}
