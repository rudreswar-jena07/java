
import java.util.Scanner;

public class qs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("addition :" + (num1 + num2));
        System.out.println("subtraction :" + (num1 - num2));
        System.out.println("multiplication :"+(num1 * num2));
        System.out.println("division :" + (num1 / num2));
        System.out.println("modulus :" + (num1 % num2));
        sc.close();
    }
}
