package Dz_do16_03;
public class Tyre {
    private Season season;
    private int radius;
    private String marka;
    public Tyre(Season season, int radius, String marka) {
        this.season = season;
        this.radius = radius;
        this.marka = marka;
    }
    public Tyre(Season season) {
    }
    @Override
    public String toString() {
        return  "season = " + season +
                ", radius = " + radius +
                ", marka = '" + marka + '\'';
    }
}

