package Task1;

public class Task1 {
    static void printSortingString(final String[] string)
    {
        for (final String value : string) {
            System.out.print(value + " ");
        }
    }
    static void SortingString(final String[] string)
    {
        for (int i = 1; i < string.length; i++) {
            for (int j = 0; j < i; j++) {
                if (string[j].length() > string[j+1].length()) {
                    final String len = string[j];
                    string[j] = string[j+1];
                    string[j+1] = len;
                }
            }
        }
    }

    public static void main(final String[] args) {
        final String[] stringArray = {"London", "is", "the", "capital", "of", "Great", "Britain"};
        SortingString (stringArray);
        printSortingString (stringArray);
    }
}

