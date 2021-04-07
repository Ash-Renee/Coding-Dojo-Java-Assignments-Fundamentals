import java.lang.Math;  //the import goes into the data side, not the test side
public class Pythagorean2 {
    public double calculateHypotenuse(int legA, int legB){
        //code goes here
        // double sideA = legA * legA;
        // double sideB = legB * legB; //these 2 lines are Asq + Bsq = Csq
        // double four = 4.0; //i think this is us saying each side is 4?
        double squareRoot = Math.sqrt(legA * legA + legB * legB); // so sqrt of 4 is 2, but dou sqrt is 4, so why do we need these?
        //it feels like these 2 lines together are almost working against each other
        return squareRoot; //needs a return function otherwise it's just gonna be like....k
    }
}