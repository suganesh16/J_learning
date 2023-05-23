package assignment;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
        int num1 = 17;
        int num2 = 5;
        
        int additionResult = add(num1, num2);
        int subtractionResult = subtract(num1, num2);
        int multiplicationResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);
        int modulusResult = calculateModulus(num1, num2);
        
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Modulus: " + modulusResult);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        return (double) a / b;
    }
    public static int calculateModulus(int a, int b) {
        return a % b;
    }
}








