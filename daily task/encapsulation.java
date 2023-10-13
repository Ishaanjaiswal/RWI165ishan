import java.util.Scanner;

class Human {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class encapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter age");
        int age = sc.nextInt();
        Human obj = new Human();
        obj.setAge(age);
        obj.setName(name);

        System.out.println(obj.getAge() + " : " + obj.getName());
        sc.close();

    }
}
