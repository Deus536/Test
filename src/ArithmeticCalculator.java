public class ArithmeticCalculator {
    private int number;
    private int number2;
    private Operation operation;

    public ArithmeticCalculator(int number, int number2) {
        this.number = number;
        this.number2 = number2;
            }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int getNumber() {
        return number;
    }

    public int getNumber2() {
        return number2;
    }

    public Operation getOperation() {
        return operation;
    }

    public int calculator(Operation operation) {
        switch (operation) {
            case ADD -> {
                int a = number + number2;
                System.out.println("Сложение двух чисел: " + number + " и " + number2 + ". Равно = " + a);
                break;
            }
            case MULTIPLY -> {
                int a = number - number2;
                System.out.println("Вычитание двух чисел: " + number + " и " + number2 + ". Равно = " + a);
                break;
            }
            case SUBTRACT -> {
                int a = number * number2;
                System.out.println("Умножение двух чисел: " + number + " и " + number2 + ". Равно = " + a);
                break;
            }

        }
        return 0;
    }
}
