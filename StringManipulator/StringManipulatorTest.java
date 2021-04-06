public class StringManipulatorTest {
    public static void main(String[] args) {
        // StringManipulator finalstring = new StringManipulator();
        // String result = finalstring.trimAndConcat("         Oh     ", "   My         ");
        // System.out.println(result);

        // StringManipulator testindex = new StringManipulator();
        // Integer finalvalue = testindex.getIndexOrNull("I am a monument to all your sins", 'y');
        // System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("Master Chief", "C");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubString("I am a monument to all your sins", 10, 13, "bacon");
        System.out.println(endResult);
    }
}

// I DID IT BUT I SURE AS FUCK DON'T UNDERSTAND ALL OF IT
// LIKE HOW THE FUCK IS THE LAST ONE UMEBACON?????
// HOW IS THE THIRD ONE -1????