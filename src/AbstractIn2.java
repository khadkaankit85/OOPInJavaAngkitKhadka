public class AbstractIn2 {
    public static void main(String[] args) {
        abstract class Machines{
           abstract public void NameOfMachine();
            abstract public void StatusOfMachine();
        }
        class Machine extends Machines {
//            @Override
            public void NameOfMachine() {
                System.out.println("the name is machine");
            }
            public void StatusOfMachine(){
                System.out.println("Its working...");
            }

        }

        Machine Car=new Machine();
        Car.NameOfMachine();
        Car.NameOfMachine();
    }
}
