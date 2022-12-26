package Task_05;

import Task_01.UserInteraction;

public class Average {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        int amount    = 0;

        UserInteraction interaction = new UserInteraction();

        for (int i = 0; i < 3; i++) {
            numbers[i] = interaction.requestIntegerNumber("Input value N" + (i + 1) + ": ");
        }

        // q: Понимаю, что здесь ввод чисел и суммирование можно было в одном цикле сделать.
        //    Но хотел попробовать циклы разных типов - for и foreach.
        //    А как правильнее: стараться делать в одном цикле, или сделать несколько циклов для лучшей читаемости?
        //    Или, может, для суммы элементов целочисленного массива есть красивый встроенный метод, как toString() для строк?
        for (int number : numbers) {
            amount += number;
        }

        double average = (double) amount / numbers.length;

        System.out.println("Average: " + average);

    }
}
