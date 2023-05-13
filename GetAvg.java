public class GetAvg implements Observer{

    private double temperature;
    private double humidity;
    private double avgTemperature;
    private double avgHumidity;
    private double totalTemperature;
    private double totalHumidity;
    private double count;

    public GetAvg(){
        totalHumidity=0.0;
        totalTemperature=0.0;
        count=0.0;
    }

    @Override
    public void update(double updatedTemperature,double updatedHumidity)
    {
        this.temperature=updatedTemperature;
        this.humidity=updatedHumidity;
        totalTemperature+=updatedTemperature;
        totalHumidity+=updatedHumidity;
        count+=1;
    }

    @Override
    public void register(WeatherStation weatherStation)
    {
        weatherStation.register(this);
    }

    @Override
    public void unregister(WeatherStation weatherStation)
    {
        weatherStation.unregister(this);
    }

    public void showAvg(){
        avgTemperature=totalTemperature/count;
        avgHumidity=totalHumidity/count;
        System.out.println("Average temperature of last "+count+" hours = "+avgTemperature);
        System.out.println("Average humidity of last "+count+" hours = "+avgHumidity);
    }
}
