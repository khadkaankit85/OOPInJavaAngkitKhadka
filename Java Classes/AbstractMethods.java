abstract class myClasses{
    abstract void myName();
}

  class myClass extends myClasses {
    public void myName(){
        System.out.println("My name is objname");
    }
}
public class AbstractMethods {


    public static void main(String[] args) {
        myClass firstObj=new myClass();
        firstObj.myName();

    }

}
