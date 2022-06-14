package Methods;

import ArraysAndLists.CatchFrisbee;

//can implement multiple interfaces but can only inherit one super class
public class Dog extends Animal implements CatchBall, CatchFrisbee {

    //dog has inherited the format and methods of Methods.Animal class
    // dog and cat inherited from animal class using extends


    String breed;
    Boolean Tail;

    public String getBreed() {
        return breed;
    }

    public Boolean getTail() {
        return Tail;
    }
    public void setTail(Boolean tail) {
        Tail = tail;
    }



    public Dog(String name, int age, String breed, Boolean tail) {
        super(name, age);
        this.breed = breed;
        Tail = tail;
    }

    //polymorphism used by overriding methods in dog and cat class
    public void makeSound() {
        //name cant be used because it belongs to animal class
        System.out.println(getName() + " Woof!");
    }


    //example of interface
    // implementing method from interface
    @Override
    public void catchObject() {
        CatchBall.super.catchObject();
    }


}
