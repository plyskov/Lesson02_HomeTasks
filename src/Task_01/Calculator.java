package Task_01;

public class Calculator {

    public double add(double a, double b){
        double result = a + b;
        return result;
    }

    public double subtract(double a, double b){
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b){
        double result = a * b;
        return result;
    }

    public double divide(double a, double b){
        double result = a / b;
        return result;
    }

    public boolean checkDivider(double divider){
        if (divider != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
