public class StaticAndNonStatic {
       int sumCalculator(int a, int b){

         return a+b;
     }
    public static void main(String[] args) {
//         System.out.println("Hello world");
        StaticAndNonStatic obj1=new StaticAndNonStatic();

        int sum= obj1.sumCalculator(5,6);
        System.out.println(sum );
    }
}

//
//public class StaticAndNonStatic {
//      static int sumCalculator(int a, int b){
//
//         return a+b;
//     }
//    public static void main(String[] args) {
//         System.out.println("Hello world");
//        int sum= sumCalculator(5,6);
//        System.out.println(sum );
//    }
//}
