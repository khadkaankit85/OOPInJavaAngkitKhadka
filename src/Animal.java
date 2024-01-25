
class Pet{

//    creating varibles for this class
    private String name;
    private int age;
    private int legs;
    private String color;
//    this is similar to __def__ in python and is called constructor.
    public Pet(String name,int age,int legs,String color){
        this.name=name;
        this.age=age;
        this.legs=legs;
        this.color=color;
    }
//    These are getter methods.
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public int getAge() {
        return age;
    }
    public int getLegs(){
        return legs;
    }
}

public class Animal {

    public static void main(String[] args) {
    Pet Dog=new Pet("Puppy",5,4,"RED");
        System.out.println(Dog.getName());
        System.out.println(Dog.getAge());
        System.out.println("The name of the dog is "+Dog.getName()+" Age is "+Dog.getAge());
    }
}
