package Task_04;

import Task_01.UserInteraction;

public class CircleInfo {
    public static void main(String[] args) {
        UserInteraction interaction = new UserInteraction();
        double radius = interaction.requestDoubleNumber("Input circle radius:");

        if (radius < 0) {
            System.out.println("Wrong input: the circle radius couldn't be less than 0.\n" +
                    "Please run the application again and input correct radius.");
            return;
        }

        interaction.outputDoubleResult(Math.PI * Math.pow(radius, 2), "Area = ");
        interaction.outputDoubleResult(2 * Math.PI * radius, "Perimeter = ");
    }
}
