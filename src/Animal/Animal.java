package Animal;

class Animal {
    int eyes;

    public Animal() {
        System.out.println("I'm animal");
    }

    public void eat() {
        System.out.println("Animals.Animal eats");
    }

    public void drink() {
        System.out.println("Animals.Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Animals.Pet runs");
    }

    public void jump() {
        System.out.println("Animals.Pet runs and jumps");
    }
}

class Dog extends Pet {
    public Dog(String name) {
        System.out.println("I'm dog and my name is: " + name);
        this.name = name;
    }

    public void play() {
        System.out.println("Animals.Dog plays");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        System.out.println("I'm cat and my name is: " + name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Animals.Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");  //like German movie
        System.out.println("My dog has " + myDog.paw + " paws");

        Cat myCat = new Cat("Mona"); //it's my female cat ^_^
        myCat.sleep();
    }
}

