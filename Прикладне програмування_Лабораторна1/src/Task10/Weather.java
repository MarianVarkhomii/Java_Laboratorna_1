package Task10;

public class Weather {
    private TypeOfWeather typeOfWeather;
    private double temperature;
    private Integer atmosphericPressure;
    private Integer humidity;

    @Override
    public String toString() {
        return "Weather{" +
                "typeOfWeather=" + typeOfWeather +
                ", temperature=" + temperature +
                ", atmosphericPressure='" + atmosphericPressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
    public Weather() {

    }

    public Weather(TypeOfWeather typeOfWeather, double temperature, Integer atmosphericPressure, Integer humidity) {
        this.typeOfWeather = typeOfWeather;
        this.temperature = temperature;
        this.humidity = humidity;
        this.atmosphericPressure = atmosphericPressure;
    }

    public TypeOfWeather getTypeOfWeather() {
        return typeOfWeather;
    }

    public void setTypeOfWeather(final TypeOfWeather typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
    }

    public Integer getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(final Integer atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getTypeOfWeather() == weather.getTypeOfWeather()
                || (this.getTypeOfWeather() != null && this.getTypeOfWeather().equals(weather.getTypeOfWeather())))
                && (this.getAtmosphericPressure() == weather.getAtmosphericPressure())
                && (this.getHumidity() == weather.getHumidity());
    }
    @Override
    public int hashCode() {
        return (int) (40 * this.getTemperature() +
                40 * this.getTypeOfWeather().hashCode() +
                40 * this.getAtmosphericPressure ()+
                40 * this.getHumidity());
    }
}
