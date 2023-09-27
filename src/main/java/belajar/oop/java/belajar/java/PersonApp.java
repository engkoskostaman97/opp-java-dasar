package belajar.oop.java.belajar.java;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("engkos", "jakarta");


        System.out.println(person1.name);
        System.out.println(person1.addres);
        System.out.println(person1.country);

        person1.sayHelli("kosta");

        Person person2 = new Person("budi");
        person2.sayHelli("tania");
        Person person3;
        person3 = new Person();
        person3.name="joko";
        person3.addres="bandung";
        person3.sayHelli("budi");


    }
}
