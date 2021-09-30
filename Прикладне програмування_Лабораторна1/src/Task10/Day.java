package Task10;

public class Day {
    public Day(TypeOfWeather typeOfWeather, NameOfDay nameOfDay, double temperature, int atmospheric, int humidity) {
        this.weather.setTypeOfWeather (typeOfWeather);
        this.nameOfDay = nameOfDay;
        this.weather.setTemperature(temperature);
        this.weather.setAtmosphericPressure(atmospheric);
        this.weather.setHumidity(humidity);
    }
    public Day( NameOfDay nameOfDay,Weather weather){
        this.nameOfDay = nameOfDay;
        this.weather.setTypeOfWeather(weather.getTypeOfWeather());
        this.weather.setTemperature(weather.getTemperature());
        this.weather.setHumidity(weather.getHumidity());
        this.weather.setAtmosphericPressure(weather.getAtmosphericPressure());
    }


    public Weather getWeather() {
        return weather;
    }
    public void setWeather(final Weather weather) {
        this.weather = weather;
    }
    public NameOfDay getNameOfDay() {
        return nameOfDay;
    }

    private Weather weather = new Weather ();
    private final NameOfDay nameOfDay;

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 50 * getNameOfDay().hashCode();
    }

    @Override
    public String toString() {
        return "Day{" +
                " nameOfDay=" + nameOfDay+" " + weather  +
                '}';
    }
}
