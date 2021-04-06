import java.lang.Math;  // to import it's import SPACE package.name.ITEM
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double four = 4.0;
        double sideA = legA * legA;
        double sideB = legB * legB;
        double squareRoot = Math.sqrt(sideA + sideB);
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        return squareRoot;
    }
}
