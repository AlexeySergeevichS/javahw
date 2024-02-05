package pack3;

public class app {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;
        a = 3;
        op = '*';
        b = 2;
        c = 7;
        op2 = '-';
        d = 4;
        undo = '<';
        Calculator calculator = new Calculator();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
        float result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        float prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
