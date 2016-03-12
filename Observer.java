import java.util.ArrayList;
import java.util.List;

/**
 *  Observer Design Pattern Example
 *
 */
public abstract class Observer {
    protected Subject mysub;
    public abstract void update();

}

class WebServer extends Observer {

    public WebServer (Subject sub) {
        this.mysub = sub;
        this.mysub.addNewObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The web server has been updated!");
    }
}

class MailServer extends Observer {

    public MailServer(Subject sub) {
        this.mysub = sub;
        this.mysub.addNewObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The mail server has been updated!");
    }
}

class DNS extends Observer {

    public DNS(Subject sub) {
        this.mysub = sub;
        this.mysub.addNewObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The domain name server has been updated!");
    }
}

class Subject {
    private List<Observer> obsList = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void addNewObserver(Observer observer) {
        obsList.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer o : obsList) {
            o.update();
        }
    }
}
