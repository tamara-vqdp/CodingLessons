package Methods;

public class Cat extends Animal{

    String breed;



    Boolean Tail;

    public Cat(String name, int age, String breed, Boolean tail) {
        super(name, age);
        this.breed = breed;
        Tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public Boolean getTail() {
        return Tail;
    }

    public void setTail(Boolean tail) {
        Tail = tail;
    }

    //polymorphism used by overriding methods in dog and cat class
    public void makeSound() {
        System.out.println(getName() + " Meow!");
    }


}
