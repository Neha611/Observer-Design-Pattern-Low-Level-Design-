import java.util.ArrayList;

public class WeatherStation implements Subject{

    private double temperature;
    private double humidity;
    private ArrayList<Observer>observers;
    public WeatherStation(){
        observers=new ArrayList<>();
    };
    @Override
    public void register(Observer observer){
        if(!observers.contains((observer)))
        {
            observers.add(observer);
        }
        else {
            System.out.println("Observer already registered");
        }
    }

    @Override
    public void unregister(Observer observer){
        if(observers.contains(observer))
        {
            observers.remove(observer);
        }
        else {
            System.out.println("Observer not registered");
        }
    }

    @Override
    public void notifyobs(){
        for(int i=0;i<observers.size();i++)
        {
            Observer observer=observers.get(i);
            observer.update(this.temperature,this.humidity);
        }
    }

    @Override
    public void update(double updatedTemperature,double updatedHumidity){
        this.temperature=updatedTemperature;
        this.humidity=updatedHumidity;
        notifyobs();
    }
}
