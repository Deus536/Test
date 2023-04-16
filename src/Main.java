public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10,12);
        arithmeticCalculator.calculator(Operation.ADD);
        arithmeticCalculator.calculator(Operation.MULTIPLY);
        arithmeticCalculator.calculator(Operation.SUBTRACT);
    }
}