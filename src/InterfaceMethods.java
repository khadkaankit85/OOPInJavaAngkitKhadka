public class InterfaceMethods {
    public static void main(String[] args) {
        interface Cars{
            public void tireCount();
            public void doorCount();
        }
         class CarDetail implements Cars{
            public void tireCount(){
                System.out.println("Cars Have four tires");
            }
            public void doorCount(){
                System.out.println("Cars have doors");
            }
        }

        CarDetail carOne=new CarDetail();
        carOne.doorCount();
        carOne.tireCount();
    }

}
