package Dz_do16_03;
public class Car {
    private Engine engine;
    private Category category;
    private Tyre tyre;
    private Number_Seats number_seats;
    private CarLock carLock;

    public boolean isKeyValid(Driver driver) {
                int carKeyLock = this.carLock.getKey_Lock();
                int driverKeyLock = carKeyLock;
                return carKeyLock == driver.getKey_Lock();
    }

    public Car(Engine engine, Category category, Tyre tyre, Number_Seats number_seats, CarLock carLock) {
        this.engine = engine;
        this.category = category;
        this.tyre = tyre;
        this.number_seats = number_seats;
        this.carLock = carLock;
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Tyre getTyre() {
        return tyre;
    }
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    public Number_Seats getNumber_seats() {
        return number_seats;
    }
    public void setNumber_seats(Number_Seats number_seats) {
        this.number_seats = number_seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", category=" + category +
                ", tyre=" + tyre +
                ", number_seats=" + number_seats +
                ", carLock=" + carLock +
                '}';
    }
}







