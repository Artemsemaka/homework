package homeworkDo13_03;



public class For {
    public static void main(String[] args) {
        int[] array = new int[]{5, 15, 146, 254, 1236, 1, 8, 25};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            for (int i = 0; i < array.length; i+=2) {
                System.out.println(array[i]);
            }
        }
    }
