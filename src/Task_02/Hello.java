package Task_02;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);
        System.out.println("What is your name, dear user? Please type:");
        System.out.println("Hello " + inputter.nextLine() + "!");
    }
}
