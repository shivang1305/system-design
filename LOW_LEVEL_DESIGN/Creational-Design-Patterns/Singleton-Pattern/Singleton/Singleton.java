public class Singleton {
    /* Method 1 - EAGER INSTANTIATION */

    // data member
    // static Singleton obj = new Singleton(); // Eager Instantiation - Object is
    // created always whether we need it or not

    // // private constructor
    // private Singleton() {
    // }

    // static Singleton getInstance() {
    // return obj;
    // }

    /* Method 2 - LAZY INSTANTIATION */

    // data member
    // static Singleton instance = null;

    // // private constructor
    // private Singleton() {
    // System.out.println("Instance Created");
    // }

    // static Singleton getInstance() {
    // if (instance == null) // this condition will be executed only once in a
    // lifetime
    // instance = new Singleton(); // Lazy Instantiation - Object is created only
    // when we need it

    // return instance;
    // }

    // public void sayHello() {
    // System.out.println("Hi, I am Singleton Class");
    // System.out.println(instance);
    // }

    /* Method 3 - Using SYNCHROMIZED keyword for thread safe */

    // data member
    // static Singleton instance = null;

    // // private constructor
    // private Singleton() {
    // System.out.println("Instance Created");
    // }

    // // synchronized is used to make the singleton class thread safe
    // // but it increases the time of getInstance by a factor of 100
    // // this can be resolved by "Double Checked Locking"
    // static Singleton getInstance() {
    // if (instance == null) // this condition will be executed only once in a
    // lifetime
    // instance = new Singleton(); // Lazy Instantiation - Object is created only
    // when we need it

    // return instance;
    // }

    // public void sayHello() {
    // System.out.println("Hi, I am Singleton Class");
    // System.out.println(instance);
    // }

    /* Method 4 - DOUBLED CHECKED LOCKING */

    // data member
    static Singleton instance = null;

    // private constructor
    private Singleton() {
        System.out.println("Instance Created");
    }

    // synchronized is used to make the singleton class thread safe
    // but it increases the time of getInstance by a factor of 100
    // this can be resolved by "Double Checked Locking"
    static Singleton getInstance() {
        if (instance == null) {// this condition will be executed only once in a lifetime
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton(); // Lazy Instantiation - Object is created only when we need it
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hi, I am Singleton Class");
        System.out.println(instance);
    }

}