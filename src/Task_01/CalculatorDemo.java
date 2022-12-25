package Task_01;

public class CalculatorDemo {

    public static void main(String[] args) {

        UserInteraction interaction = new UserInteraction();
        Calculator calculator = new Calculator();

        double number1 = interaction.requestNumber("Input the first number:");
        double number2 = interaction.requestNumber("Input the second number:");

        boolean checkDividerResult = calculator.checkDivider(number2);

        if (!checkDividerResult){
            System.out.println("The second number is incorrect: division by zero is not allowed.");
            System.out.println("Please run the application again with the correct parameters.");
            return;
        }

        interaction.outputResult(calculator.add(number1, number2), "The sum is");
        interaction.outputResult(calculator.subtract(number1, number2), "The substraction is");
        interaction.outputResult(calculator.multiply(number1, number2), "The multiplication is");
        interaction.outputResult(calculator.divide(number1, number2), "The division is");

    }

}
