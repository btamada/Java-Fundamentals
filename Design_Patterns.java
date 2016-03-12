/**
 *  Design Patterns
 *
 *  1) Singleton
 *  2) Factory
 *  3) Observer
 *  4) Adapter
 *  5) Facade
 *
 */
public class Design_Patterns {

    public static void main(String... args) {

        /**
         *
         * Singleton Pattern
         *
         * NOTE: It appears that we are able to create another instance of the Singleton class by recalling the
         * getInstance() method, but what it is actually doing is return the same instance that was created the first
         * time that getInstance() was called.
         *
         */
        Singleton mySingleton1 = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();

        if(mySingleton1 == mySingleton2) System.out.println("TRUE");

        /**
         *  Factory Pattern
         *
         *  - Within the Factory class there is an inner class defined called "FoodFactory"
         *  - Create an instance of the FoodFactory class to call its getFood() method, which will return a Food type
         *  -  Be sure to call the Factory class when you create a new variable of Food type as the Food interface is defined within the Factory class
         *  - You are then able to call the getType() method to determine the food instance you are working with
         *
         */
        Factory.FoodFactory myFactory = new Factory.FoodFactory();
        Factory.Food myPizza = myFactory.getFood("pizza");
        Factory.Food myCake = myFactory.getFood("cake");
        Factory.Food myBurger = myFactory.getFood("burger");

        System.out.println(myPizza.getType());
        System.out.println(myCake.getType());
        System.out.println(myBurger.getType());

        /**
         *  Observer Pattern
         *
         *  This pattern allows you to interact with multiple instances of the Observer abstract class by making
         *  changes to the Subject class that is mapped to these instances via a property declaration.
         *
         *  This can be useful for submitting a single change that could potentially change the state of multiple
         *  server objects, for example.
         */
        Subject mySubObj = new Subject();

        new MailServer(mySubObj);
        new DNS(mySubObj);
        new WebServer(mySubObj);

        System.out.println("I am now setting the state of the object to 30");
        mySubObj.setState(30);
        System.out.println("I am now setting the state of the object to 9000");
        mySubObj.setState(9000);

        /**
         *
         * Adapter Pattern
         *
         */
        AdapterPattern adapterPattern = new AdapterPattern();
        adapterPattern.play("mp3", "beyond the horizon.mp3");
        adapterPattern.play("mp4", "alone.mp4");
        adapterPattern.play("vlc", "far far away.vlc");
        adapterPattern.play("avi", "mind me.avi");

        /**
         *
         * Facade Pattern
         *
         */
        FacadePattern fp = new FacadePattern();
        fp.drawCircle();
        fp.drawRectangle();
        fp.drawSquare();
    }

}
