public class PythagoreanTest2 {
    public static void main(String[] args) {  //standard line, always goes here
        Pythagorean2 id = new Pythagorean2 (); // i assume that this means hey lets do a new one.
        // in theory could have set to JamesBond??
        double hypotenuse = id.calculateHypotenuse(5, 5); //the math part
        System.out.println(hypotenuse); //the answer part
    }
}