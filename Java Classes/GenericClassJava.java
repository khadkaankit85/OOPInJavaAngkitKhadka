public class GenericClassJava {

    public static class Bird<T>{
        T data;
        Bird(T data){
            this.data=data;
        }
        T birdDetail(){
            return data;
        }
    }
    public static void main(String[] args) {
    Bird<String> obj1=new Bird<String>("Eagle");
//        System.out.println(obj1.birdDetail());

        Bird<Integer> obj2=new Bird<Integer>(2);
        System.out.println(obj1.birdDetail()+" has "+obj2.birdDetail()+ " legs.");
    }
}
