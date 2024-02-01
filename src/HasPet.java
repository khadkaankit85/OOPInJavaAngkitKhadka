class Pet{
     String petname;
    public Pet(String a){
        this.petname=a;
    }
    public String getPetName(){
        return this.petname;
    }
}

class Person {
    private String name;
    Pet petobj;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setPetName(Pet pet) {
        this.petobj = pet;
        System.out.printf("Hey, I am %s's pet %s%n", this.name, this.petobj.getPetName());
    }


}
public class HasPet {
    public static void main(String[] args) {

        Pet pet1=new Pet("Dogesh");
        Person per1= new Person("Angkit");
        per1.setPetName(pet1);
        System.out.println("The owner is" +per1.getName());
        System.out.println("The pet is "+ per1.petobj.getPetName());
    }
}