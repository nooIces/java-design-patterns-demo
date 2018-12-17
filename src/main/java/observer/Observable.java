package observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable {

    protected List<Observer> observers;

    private volatile boolean update;

    public Observable(){
        observers = new CopyOnWriteArrayList<>();
        update = false;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void deleteObserver(Observer o){
        observers.remove(o);
    }

    public synchronized void notifyObservers(Object o){
        setUpdate(true);
        for(Observer ob : observers){
            ob.updateInfo(this, o);
        }
        setUpdate(false);
    }

    public abstract void showMessage();

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }
}
