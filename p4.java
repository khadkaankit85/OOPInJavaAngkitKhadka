// example of overloading methods have same name different parameters
class Calculation	{  
      void sum(int a,int b) {  // method sum has 2 parameters
       System.out.println(a+b); }  
      void sum(int a,int b,int c) {  // method sum has 3 parameters
      System.out.println(a+b+c); }  
      public static void main(String args[]) 	{  
      Calculation obj=new Calculation();  
      obj.sum(10,20,30);  
      obj.sum(20,20);  
      }  
    } 
