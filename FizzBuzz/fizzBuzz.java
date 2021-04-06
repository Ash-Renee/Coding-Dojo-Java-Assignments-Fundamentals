public class fizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("number is " + number);
        }
        return ("number is " + number);
}
}