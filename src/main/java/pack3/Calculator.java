package pack3;

public class Calculator {
    private static Integer prevRes = 0;
    private static char prevOp;
    private static int prevA;
    private static int prevB;

    public float calculate(char op, int a, int b) {
        if (!(op == '<')) {
            int rez;
            prevOp = op;
            prevA = a;
            prevB = b;
            rez = calc(op, a, b);
            prevRes += rez;
            return (float)rez;
        } else {
            return prevRes - calc(prevOp, prevA, prevB);
        }


    }

    private Integer calc(char op2, int a2, int b2) {
        return switch (op2) {
            case '+' -> a2 + b2;
            case '-' -> a2 - b2;
            case '*' -> a2 * b2;
            case '/' -> !(b2 == 0) ? a2 / b2 : null;
            default -> null;
        };
    }
}
