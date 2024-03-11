package homeworkDo13_03;
import java.util.Scanner;
    

public class Proizvedenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = scanner.nextInt();
        int result = calculate(n);
        System.out.println(result);
    }

    public static int calculate(int n) {
        if (n >= 10) {
            return n % 10 * calculate(n / 10);
        } else {
            return  n ;
        }
    }
}