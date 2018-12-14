package memento;

public class Originator {

    private String state;

    public Originator(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void getFromMemento(Memento memento){
        setState(memento.getState());
    }
}
