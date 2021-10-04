package Observer_Pattern;

public interface Subject {
    public void register(Observer O);
    public void Unregister(Observer O);
    public void notifyObserver();
}
