package Task8;

public class Main {
    public static void main(final String[] args) throws Exception {
        final CustomDouble customDouble1 = new CustomDouble(5, 5.1);
        final CustomDouble customDouble2 = new CustomDouble(-12, 31.5);
        System.out.println ("Number 1: " + customDouble1);
        System.out.println ("Number 2: " + customDouble2);
        System.out.println ("division = " + customDouble1.division (customDouble2));
        System.out.println ("sum = " + customDouble1.addition (customDouble2));
        System.out.println ("subtraction =  " + customDouble1.subtraction (customDouble2));
        customDouble1.comparison(customDouble2);
        System.out.println (customDouble1.equals(customDouble2));
        System.out.println (customDouble2.hashCode());
    }
}
