package Dz_do16_03;
public class Program {
    public static void main(String[] args) {
        Car skoda = new Car(new Engine(1600, 95, "CWVA"),new Category("B"),
                new Tyre(Season.WINTER, 16, "Continental"),
                new Number_Seats(5), new CarLock(123));
        System.out.println(skoda);
        Driver driver = new Driver(new Driver_Key(123),new Category("B"));
            boolean keyValid = skoda.isKeyValid(driver);
            if (keyValid) {
                System.out.println("Ключ подошел");
            } else {
                System.out.println("Ключ не подходит");
            }
    }
}



