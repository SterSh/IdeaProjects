package shaw;

public class HelloWorld {

    public static void main(String[] args) {

        //HelloWorld hello = new HelloWorld();
        //hello.sayHello();

        CircleCalculator calc = new CircleCalculator();

        double input = CircleCalculator.getRadius();
        calc.displayArea(input);
        calc.displayCircumference(input);

    }

    static void sayHello() {
        //System.out.println("Hello World");
    }
}
