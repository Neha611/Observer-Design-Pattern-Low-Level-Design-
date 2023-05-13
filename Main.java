public class Main {
    public static void main(String[] args) {
        WeatherStation ws=new WeatherStation();
        GetInfo gi=new GetInfo();
        gi.register(ws);
        GetAvg ga=new GetAvg();
        ga.register(ws);
        ws.update(30,20);
        gi.showInfo();
        ga.showAvg();
        ga.unregister(ws);
        ga.unregister(ws);
    }
}