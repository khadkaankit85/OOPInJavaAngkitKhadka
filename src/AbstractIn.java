public class AbstractIn {
    public static void main(String[] args) {
        abstract class MyAbstractClass {
            abstract void myAbstractMethod();

            void myConcreteMethod() {
                System.out.println("Concrete method in abstract class");
            }
        }

        class MyConcreteClass extends MyAbstractClass {
            @Override
            void myAbstractMethod() {
                System.out.println("Implementation of myAbstractMethod");
            }
        }

// Usage
        MyAbstractClass obj = new MyConcreteClass();
        obj.myAbstractMethod();
        obj.myConcreteMethod();



    }
}
