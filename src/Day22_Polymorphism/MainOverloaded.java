package Day22_Polymorphism;

public class MainOverloaded {
    public static void main(String[] args) {
        main();
        main("Hello World");
        main("Tom","Jerry");
    }

    public static void main() {
        System.out.println("Hi");
    }

    public static void main(String args) {
        System.out.println("Overloaded: "+args);
    }

    public static void main(String args1,String args2) {
        System.out.println("Overloaded: "+args1+"&"+args2);
    }
}


