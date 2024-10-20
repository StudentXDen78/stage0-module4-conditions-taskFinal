package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        // and will perform integer division of dividend be divider, save the value,
        // and then will multiply result by divider and will if got value is equal
        // to dividend will print:"can be divided completely",
        // otherwise "cannot be divided completely"
        // or "division by zero".
        if (dividend == 0 || divider == 0) {
            System.out.println("division by zero");
            return;
        }
        int integerDivision = dividend / divider;
        if ((integerDivision * divider) == dividend) System.out.println("can be divided completely");
        else System.out.println("cannot be divided completely");
    }
}
