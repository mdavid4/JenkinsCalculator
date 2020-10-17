import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(args.length == 0) {
            return;
        }
        Calculator calc = new Calculator();
        if (input.contains("add")) {
            System.out.println(calc.add(in.nextInt(),
                    in.nextInt()));
        }
        input = in.next();
        if (input.contains("subtract")) {
            System.out.println(calc.subtract(in.nextInt(),
                    in.nextInt()));
        }
        input = in.next();
        if (input.contains("multiply")) {
            System.out.println(calc.multiply(in.nextInt(),
                    in.nextInt()));
        }
        input = in.next();
        if (input.contains("divide")) {
            System.out.println(calc.divide(in.nextInt(),
                    in.nextInt()));
        }
        input = in.next();
        if (input.contains("fibonacci")) {
            System.out.println(calc.fibonacciNumberFinder(in.nextInt()));
        }
        input = in.next();
        if (input.contains("binary")) {
            System.out.println(calc.intToBinaryNumber(in.nextInt()));
        }
    }
}
