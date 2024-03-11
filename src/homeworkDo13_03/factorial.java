package homeworkDo13_03;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int num1 = in.nextInt();
        System.out.println(calculateFactorial(num1));
    }
    static String calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return "Факториал числа равен " + result  ;
    }
}