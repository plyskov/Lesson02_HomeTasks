package Task_01;

public class CalculatorDemo {

    public static void main(String[] args) {

        UserInteraction interaction = new UserInteraction();
        Calculator calculator = new Calculator();

        double number1 = interaction.requestDoubleNumber("Input the first number:");
        double number2 = interaction.requestDoubleNumber("Input the second number:");

        boolean checkDividerResult = calculator.checkDivider(number2);

        if (!checkDividerResult){
            // q: Как лучше по правилам хорошего тона: разделять проверку некорректных данных и вывод сообщений об этом пользователю?
            //    Или лучше выводить сообщение об ошибке входных данных непосредственно в методе проверки, т. е. в calculator.checkDivider?
            //    Или, может, лучше не прерывать программу в целом,
            //    а вывести сообщение об ошибке деления на 0 непосредственно в методе, выполняющем деление?
            System.out.println("The second number is incorrect: division by zero is not allowed.\n" +
                               "Please run the application again with the correct parameters.");
            return;
        }

        interaction.outputDoubleResult(calculator.add(number1, number2), "The sum is");
        interaction.outputDoubleResult(calculator.subtract(number1, number2), "The substraction is");
        interaction.outputDoubleResult(calculator.multiply(number1, number2), "The multiplication is");
        interaction.outputDoubleResult(calculator.divide(number1, number2), "The division is");

    }

}
