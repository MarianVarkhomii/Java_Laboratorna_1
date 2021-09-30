package Task3;

public class Task3 {
    public static void main(final String[] args)
    {
        final int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final char[] arrayChar = {'a', 'n', 't', 'e', 's', 'b', 'q', 'j', 'p'};
        printString (arrayInt, arrayChar);
    }
    public static String recordTwoArraysInString(final int[] arrayInt, final char[] arrayChar)
    {
        final int maxLength;
        if (arrayChar.length >= arrayInt.length) {
            maxLength = arrayChar.length;
        } else {
            maxLength = arrayInt.length;
        }
        String result = " ";
        for (int i = 0; i < maxLength; i++){
            if (i < arrayInt.length) {
                result += arrayInt[i];
            }
            if (i < arrayChar.length) {
                result += arrayChar[i];
            }
        }
        return result;
    }
    public static void printString(final int[] intArray, final char[] charArray){
        System.out.println(recordTwoArraysInString(intArray, charArray));
    }
}
