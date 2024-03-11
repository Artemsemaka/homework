package homeworkDo13_03;



public class tablica {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++) {
                System.out.printf("%5d", (i + 1) * (a + 1));
            }
            System.out.println();
        }
    }
}