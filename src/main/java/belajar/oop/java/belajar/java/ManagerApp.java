package belajar.oop.java.belajar.java;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name="engkos";
        manager.SayHello("Budi");

        var vp = new VicePresident();
        vp.name = "engkos";
        vp.SayHello("joko");
    }
}
