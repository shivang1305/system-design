public class Main {
    public static void main(String[] args) {
        // check that weather only single instance is created or not

        // Singleton singleton = Singleton.getInstance();
        // singleton.sayHello();

        // // both returns the same instance instead of creating two objects

        // Singleton singleton2 = Singleton.getInstance();
        // singleton2.sayHello();

        // Multithreading
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton obj = Singleton.getInstance();
                obj.sayHello();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton obj = Singleton.getInstance();
                obj.sayHello();
            }
        });

        t1.start();
        t2.start();

    }
}
