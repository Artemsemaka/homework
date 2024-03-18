package Dz_do16_03;

public class CarLock {
    private final int Key_Lock;
    public CarLock(int keyLock) {
        Key_Lock = keyLock;
    }
    public int getKey_Lock() {
        return Key_Lock;
    }
    @Override
    public String toString() {
        return "Key_Lock=" + Key_Lock +'}';
    }
}
