interface Bird{
    public void fly();
    public void eat();
}

     class Sparrow implements Bird{
         @Override
         public void eat() {
             System.out.println("Sparrow flies high in the Sky.");
         }
         public void fly(){
             System.out.println("Sparrow eats grains.");
         }
         public int numberOfLegs(){
             return 2;
         }

     }



public class InterfacesAtHomeDay9 {
    public static void main(String[] args) {
        Sparrow firstBird=new Sparrow();
        firstBird.eat();
        firstBird.fly();
        System.out.println(firstBird.numberOfLegs());
        System.out.println("------------------------------->");
        System.out.println("hey i am the first sparrow bird. I have "+firstBird.numberOfLegs()+" legs");
    }
}
