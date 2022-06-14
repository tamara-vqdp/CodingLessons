package Methods;

public abstract class Animal {

    //this class is encapsulated,
    // methods and constructors is only within this class
    //private = only accessible through the class itself
    //two attributes
    private String name;
    private int age;

    //gets information about an object
    public String getName() {
        return name;
    }
    // setter allows a value to be set
    public void setName(String name) {
        this.name = name;
    }

    //method to allow age to go up by one
    public int getAge() {
        return age;
    }

    //method to make sounds
    public void setAge(int age) {
        this.age = age;
    }

        //set up a way to build animals, set parameters up with constructor
        //setup the inital state of the instantiated object(e.g name, age)
    // constructor will have the same name as the class
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void growOlder() {
        age++;
        }

        //makes sure that when create class that the makesound is in it
    // to be accessed from sub classes need to declare method as abstract too
        public abstract void makeSound();

        public static void main(String[] args) {
        //abstract class cannot be instantiated
           /*Methods.Animal a1 = new Methods.Animal("Spot", 2);
           Methods.Animal a2 = new Methods.Animal("Meg", 4);

           for(int i = 0; i < 4; i++) {
               a1.growOlder();
           }
            System.out.println(a1.getAge()+" "+a1.getName());
            a1.makeSound();
            */
            Dog d1 = new Dog("Spot", 2, "Mongrel", true);


            System.out.println(d1.getName() + " is " + d1.getAge() + " years old");
            d1.growOlder();
            d1.makeSound();

            Cat c1 = new Cat("Meg", 4, "Highgate", true);
            System.out.println(c1.getName() + " is a " + c1.getBreed() + " and is " + c1.getAge() + " years old." );
            c1.growOlder();
            c1.makeSound();


            Person p1 = new Person("Tamara", "De Paula", 22, "se349je");
            System.out.println(p1.fName() + " " + p1.lName());

        }

    }

