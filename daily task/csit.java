class aicte {
    public void display() {
        System.out.println("register here");
    }
}

interface csvtu {
    void exam();

    void canteen();

}

class csits extends aicte implements csvtu {
    public void exam() {
        System.out.println("exam date");
    }

    public void canteen() {
        System.out.println("i am canteen");
    }
}

public class csit {
    public static void main(String[] args) {
        csits c1 = new csits();
        c1.exam();
        c1.canteen();
        c1.display();
    }
}
