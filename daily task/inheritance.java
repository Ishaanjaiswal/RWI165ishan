class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }

    // @Override
    // public void eat() {
    // System.out.println("Dog is eating.");
    // }
}

class inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Calls the overridden method in Dog class
        myDog.bark();
        // System.out.println(a);
    }

}
