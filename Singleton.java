/**
 *  Example of implementing the Singleton Design Pattern
 */
public class Singleton {

    private static Singleton mySingleton;

    // make the constructor private so we cannot make a new instance of the Singleton class
    private Singleton() {}

    // make static since we cannot create an instance of the singleton class
    public static Singleton getInstance() {
        if(mySingleton == null) {
            synchronized (Singleton.class) {
                if(mySingleton == null) {
                    mySingleton = new Singleton();
                }
            }
        }
        return mySingleton;
    }

}
