package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
    // output when correct: "this is a valid triangle", otherwise : "it's not a triangle")
        if (((int)firstSide == (int)secondSide) && ((int)secondSide == (int)thirdSide)) {
            System.out.println("this is a valid triangle");
        }
        else System.out.println("it's not a triangle");
    }
}
