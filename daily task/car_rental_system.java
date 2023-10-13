import java.util.Scanner;

class car {
    int avilableCar = 10;
    int avilablity;

    public void show() {
        System.out.println(avilableCar);
    }

    public void avilablity(int a) {
        avilablity = a;
        // if()
    }
}

public class car_rental_system {

    public static void main(String[] args) {
        int remainingCar = 0;
        Scanner sc = new Scanner(System.in);
        car obj = new car();
        int avilablity = obj.avilableCar;
        System.out.println("Avilable Cars : " + avilablity);
        System.out.println("Enter the number of Cars you want : ");
        int need = sc.nextInt();
        try {
            if (need > 0 && need < 5) {
                System.out.println("you got " + need + " cars");
            }

        } catch (Exception e) {
            // TODO: handle exception
            // if (need >= 5) {
            System.out.println("We cant provide more then five cars at a time");
            // }
        }

        remainingCar = avilablity - need;
        System.out.println("Remaining Cars : " + remainingCar);
        sc.close();

    }
}
