package Task_01;

import java.util.Scanner;

public class UserInteraction {

    public double requestNumber(String questionMessage){

        Scanner inputter = new Scanner(System.in);

        // q: Не нашел, как сделать, чтобы после текстового сообщения курсор для ввода в консоли оставался в той же строке.
        //    Это вообще возможно в Java?
        System.out.println(questionMessage);

        return inputter.nextDouble();

    }

    public void outputResult(double result, String outputMessage){
        System.out.println(outputMessage + " " + result);
        // q: Так нормально делать по правилам хорошего тона (добавлять пробел в выводящем методе)?
        //    Или лучше избегать неявного добавления символов к переданному сообщению и передавать outputMessage сразу с пробелом?
    }

}
