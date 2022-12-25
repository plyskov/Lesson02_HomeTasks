package Task_01;

import java.util.Scanner;

public class UserInteraction {

    public double requestNumber(String questionMessage){

        System.out.println(questionMessage);

        Scanner inputter = new Scanner(System.in);
        double result = inputter.nextDouble();

        return result;
    }

    public void outputResult(double result, String outputMessage){
        System.out.println(outputMessage + " " + result);
    }

}
