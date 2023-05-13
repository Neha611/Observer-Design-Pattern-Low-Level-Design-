public interface Observer {
    public void update(double updatedTemperature,double updatedHumidity);
    public void register(WeatherStation weatherStation);

    public void unregister(WeatherStation weatherStation);
}
