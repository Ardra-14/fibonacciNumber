import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        fibonacci f = new fibonacci();
        int result = f.process(n - 1);
        System.out.println("The " + n + "th fibonacci number is: "+result);
    }
}