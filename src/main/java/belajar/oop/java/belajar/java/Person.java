package belajar.oop.java.belajar.java;

class Person {
    String name;
    String addres;
    final String country = "INDONESIA";

    Person (String paramName, String paramAddres){
        name= paramName;
        addres = paramAddres;
    }

    Person (String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }

     void sayHelli(String paramName){
         System.out.println("Hello "+ paramName + ",My Name is "+  name+ addres);
     }
}
