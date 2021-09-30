package Task2;

public class Task2 {
    public static int countChar(final String string, final char c) {
        int result = 0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i) == c){
                result++;
            }
        }
        return result;
    }

    static void printNumberOfChar(final String string, final char c) {
        System.out.println ( "Total number of char \""+c+"\" in a string: " + countChar (string,c)) ;
    }

    public static void main(final String[] args) {
        final String string =  "Success is one percent inspiration, ninety-nine percent perspiration";
        final char c = 'e';

        System.out.println (string);
        printNumberOfChar (string,c);
    }
}
