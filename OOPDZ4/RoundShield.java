package OOPDZ4;

public class RoundShield implements Shield {

    @Override
    public Integer absorb() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb %d", absorb());
    }

}
