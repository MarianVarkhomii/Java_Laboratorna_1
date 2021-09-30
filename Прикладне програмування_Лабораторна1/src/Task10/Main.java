package Task10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final Weather arrWeather[] = new Weather[n];
        final Day [] day = new Day[n];
        arrWeather[0] = new Weather(TypeOfWeather.CLOUDY, 30.1, 750, 58);
        arrWeather[1] = new Weather(TypeOfWeather.COLD, -30.1, 730, 79);
        arrWeather[2] = new Weather(TypeOfWeather.HOT, 17.2, 744, 68);
        arrWeather[3] = new Weather(TypeOfWeather.RAINY, 12, 744, 65);
        arrWeather[4] = new Weather(TypeOfWeather.WINNY, 12.5, 768, 80);
        arrWeather[5] = new Weather(TypeOfWeather.CLOUDY, 14.6, 735, 50);
        arrWeather [6] = new Weather(TypeOfWeather.RAINY, 9.2, 756, 70);

        day[0] = new Day(NameOfDay.MONDAY, arrWeather[0]);
        day[1] = new Day(NameOfDay.TUESDAY, arrWeather[2]);
        day[2] = new Day(NameOfDay.WEDNESDAY, arrWeather[5]);
        day[3] = new Day(NameOfDay.THURSDAY, arrWeather[6]);
        day[4] = new Day(NameOfDay.FRIDAY, arrWeather[1]);
        day[5] = new Day(NameOfDay.SATURDAY, arrWeather[3]);
        day[6] = new Day(NameOfDay.SUNDAY, arrWeather[6]);
        printWeatherCalendar (day);
    }
    private static void printWeatherCalendar(final Day [] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}

