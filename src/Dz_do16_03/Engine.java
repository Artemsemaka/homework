package Dz_do16_03;

public class Engine {
   private int volume;
    private int benzin;
    private String name;

    public Engine(int volume, int benzin, String name) {
        this.volume = volume;
        this.benzin = benzin;
        this.name = name;
    }
    @Override
    public String toString() {
        return  "volume = " + volume +
                ", benzin = " + benzin +
                ", name = '" + name + '\'';
    }
}


