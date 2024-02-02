public class InterfaceIn {

    interface myInterface{
         void myFirstInterfaceClass();
         void mySecondInterfaceClass();
    }

    class  myClass implements myInterface{
        public void  myFirstInterfaceClass(){
            System.out.println("this is first class that is written in the interface");
        }
        public void mySecondInterfaceClass(){
            System.out.println("this is second class that is written in interface");
        }
    }

    public static void main(String[] args) {

        InterfaceIn a= new InterfaceIn();
         myClass aa= a.new myClass();
         aa.myFirstInterfaceClass();
    }
}
