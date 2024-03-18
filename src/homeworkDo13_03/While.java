package homeworkDo13_03;

public class While {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 15,20,30};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}