package homeworkDo13_03;
public class massiv {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 4, null, 5, 6};

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] == null) {
                break;
            }
            System.out.println(array[i]);
        }
    }
}
