    package Day22_Polymorphism;

    import Day13_Online_Class.SOD;

    public class Zoo {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            dog.animal();
            cat.animal();
        }
    }

    class Animal{
        public void animal() {
            System.out.println("Animal");
        }
    }

    class Dog extends Animal{
        public  void animal()
        {
            System.out.println("Dog");
        }
    }

    class Cat extends Animal{
        @Override
        public void animal() {
            System.out.println("Cat");
        }
    }

