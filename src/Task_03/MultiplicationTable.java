package Task_03;

import Task_01.Calculator;
import Task_01.UserInteraction;

public class MultiplicationTable {
    public static void main(String[] args) {

        UserInteraction interaction = new UserInteraction();
        Calculator calculator = new Calculator();

        int multipliable = interaction.requestIntegerNumber("Enter an integer for the multiplication table:");
        String multipliableString = Integer.toString(multipliable);

        for (int multiplier = 1; multiplier <= 10; multiplier++){
            // q: Как правильнее: сразу делать счетчик цикла в нужных пределах (от 1 до 10), или начинать с 0,
            //    а в теле цикла использовать для вычислений другую переменную со значением (счетчик + 1)?
            interaction.outputIntegerResult((int) calculator.multiply(multipliable, multiplier),
                    multipliableString + " x " + multiplier + " = ");
        }

    }
}
