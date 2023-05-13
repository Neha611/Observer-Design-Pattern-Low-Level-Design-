public class GetInfo implements Observer{

    private double temperature;
    private double humidity;

    public GetInfo(){

    };

    @Override
    public void register(WeatherStation weatherStation){
        weatherStation.register(this);
    }

    @Override
    public void unregister(WeatherStation weatherStation)
    {
        weatherStation.unregister(this);
    }

    public void update(double updatedTemperature,double updatedHumidity){
        this.temperature=updatedTemperature;
        this.humidity=updatedHumidity;
    }

    public void showInfo()
    {
        System.out.println("Current temperature = "+this.temperature);
        System.out.println("Current humidity = "+this.humidity);
    }
}
