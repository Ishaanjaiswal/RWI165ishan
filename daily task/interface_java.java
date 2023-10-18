interface Bicycle {
    void applyBrake();

    void speedUp();
}

interface HornBicycle {

    void blowHorn();

    void blowHorntata();
}

class AvonCycyle implements Bicycle, HornBicycle {

    public void applyBrake() {
        System.out.println("appling brake");
    }

    public void speedUp() {
        System.out.println("appling speed");
    }

    public void blowHorn() {
        System.out.println("pipipipipipi");
    }

    public void blowHorntata() {
        System.out.println("pom pom pom");
    }
}

public class interface_java {
    public static void main(String[] args) {
        AvonCycyle a1 = new AvonCycyle();
        a1.applyBrake();
        a1.speedUp();
        a1.blowHorn();
        a1.blowHorntata();
    }
}