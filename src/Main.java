import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = in.nextInt();

        if (age >= 21) {
            System.out.println("You are 21 or older. You get a paper wristband");
        }
        in.close();
    }
}