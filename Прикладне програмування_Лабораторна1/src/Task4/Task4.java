package Task4;

public class Task4 {
    public static void main(final String[] args) {
        final String string1 = "Fizz";
        final String string2 = "Buzz";
        final int n = 100;
        final int[] arr = new int[n];

        for (int i = 1; i <= arr.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println(" n = " + string1 + string2);
            else if (i % 3 == 0)
                System.out.println(" n = " + string1);
            else if (i % 5 == 0)
                System.out.println(" n = " + string2);
            else System.out.println(" n = " + i);
        }
    }
}
