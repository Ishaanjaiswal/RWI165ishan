abstract class car {

    public abstract void drive();

    public abstract void flying();

    public void music() {
        System.out.println("music is playing");
    }
}

abstract class wagonR extends car {

    public void drive() {
        System.out.println("driving...");
    }
}

class advCar extends wagonR {

    public void flying() {
        System.out.print("Flying....");
    }
}

public class Inheritance_i {
    public static void main(String a[]) {

        car obj = new advCar();
        obj.drive();
        obj.music();
        obj.flying();
    }
}
