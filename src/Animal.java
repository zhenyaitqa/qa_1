public class Animal {
    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

    Animal() {
        System.out.println("I am animal");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;
    int eyes = 2;

    Pet() {
        System.out.println("I am pet");

    }

    void run() {
        System.out.println("Pet run");
    }

    void jump() {
        System.out.println("Pet jumps");
    }

    class Dog extends Pet {
        Dog() {
            System.out.println("I am dog and my name is " + name);
        }

        void play() {
            System.out.println("Dog plays");
        }
    }

    class Cat extends Pet {
        Cat() {
            System.out.println("I am cat and my name is " + name);
        }

        void sleep() {
            System.out.println("Cat sleeps");
        }
    }

    class Test {
        public static void main(String[] args) {


        }
    }


}
