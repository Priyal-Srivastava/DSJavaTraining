package OOPS;

public class Inheritence {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.printParent(); // method of Parent class
        parents.printGrandParent(); // method of GrandParent class  accessed by Parent class using inheritance

        Child child = new Child();
        child.printChild(); // method of child class
        child.printParent(); // method of Parent class accessed by child class using inheritance
        child.printGrandParent(); // method of GrandParent class accessed by child class using inheritance
    }
}

class GrandParent{
    void printGrandParent(){
        System.out.println("I am GrandParent");
    }
}

class Parents extends GrandParent{
    void printParent(){
        System.out.println("I am Parent");
    }
}

class Child extends Parents{
    void printChild(){
        System.out.println("I am Child");
    }
}