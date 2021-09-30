package Task9;

public class Calculator {
    private static double addition(final double number1, final double number2){
        final CustomDouble customDouble1 = new CustomDouble(number1);
        final CustomDouble customDouble2 = new CustomDouble(number2);
        return customDouble1.addition (customDouble2).toDouble();
    }

    private static double multiply(final double number1, final double number2){
        final CustomDouble customDouble1 = new CustomDouble(number1);
        final CustomDouble customDouble2 = new CustomDouble(number2);
        return customDouble1.multiplication (customDouble2).toDouble();
    }

    private static double subtraction(final double number1, final double number2){
        final CustomDouble customDouble1 = new CustomDouble(number1);
        final CustomDouble customDouble2 = new CustomDouble(number2);
        return customDouble1.subtraction (customDouble2).toDouble();
    }

    private static double division(final double number1, final double number2) throws Exception {
        final CustomDouble customDouble1 = new CustomDouble(number1);
        final CustomDouble customDouble2 = new CustomDouble(number2);
        return customDouble1.division(customDouble2).toDouble();
    }

    static double calculatorChange(final double number1, final double number2, final char char1) throws Exception {
        switch (char1){
            case '+':
                return  addition (number1,number2);
            case '*':
                return multiply (number1, number2);
            case '/':
                return division (number1,number2);
            case '-':
                return subtraction (number1, number2);
            default:
                System.out.println ("Invalid numbers, enter +, -,*, /");
                return 0;

        }
    }

    static double calculatorChange(final int number1, final int number2, final char string) throws Exception {
        switch (string){
            case '+':
                return   addition (number1, number2);
            case '*':
                return multiply (number1, number2);
            case '/':
                return division (number1, number2);
            case '-':
                return subtraction (number1, number2);
            default:
                System.out.println ("Invalid numbers, enter +, -,*, /");
                return 0;

        }
    }
}
