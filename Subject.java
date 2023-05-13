public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyobs();
    public void update(double updatedTemperature,double updatedHumidity);
}
