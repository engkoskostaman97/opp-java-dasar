package belajar.oop.java.belajar.java;

class Person {
    String name;
    String addres;
    final String country = "INDONESIA";

     void sayHelli(String paramName){
         System.out.println("Hello "+ paramName + ",My Name is "+  name);
     }
}
