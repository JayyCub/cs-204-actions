import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("INITIATING CALCULATOR...");
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a command:\n" +
                "(add, subtract, multiply, divide, fibonacci, binary, exit)\n\n");
        String command = scanner.nextLine();
        while (!Objects.equals(command, "exit")){
            String[] comm_args = command.split("\\s+");
            switch (comm_args[0]) {
                case "add":
                    System.out.println(calculator
                            .add(Integer.parseInt(comm_args[1]), Integer.parseInt(comm_args[2])));
                    break;
                case "subtract":
                    System.out.println(calculator
                            .subtract(Integer.parseInt(comm_args[1]), Integer.parseInt(comm_args[2])));
                    break;
                case "multiply":
                    System.out.println(calculator
                            .multiply(Integer.parseInt(comm_args[1]), Integer.parseInt(comm_args[2])));
                    break;
                case "divide":
                    System.out.println(calculator
                            .divide(Integer.parseInt(comm_args[1]), Integer.parseInt(comm_args[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(comm_args[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(comm_args[1])));
                    break;
                default:
                    System.out.println("Invalid command\n");
            }

            command = scanner.nextLine();
        }

        scanner.close();
        System.out.println("Closing program...");
    }
}
