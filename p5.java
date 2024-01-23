public class CodeExample {  //overriding the methods same name & parameters but different action.

public static void main(String[] arg) {

Bank sbibank=new SBI();  // create object for SBI

Bank icicibank=new ICICI();  // create object for ICICI

Bank axisbank=new AXIS();  // create object for AXIS

System.out.println("SBI Rate of Interest: "+sbibank.getRateOfInterest());  

System.out.println("ICICI Rate of Interest: "+icicibank.getRateOfInterest());  

System.out.println("AXIS Rate of Interest: "+axisbank.getRateOfInterest());  

}

}//creating parent class

class Bank{  

//create function to calculate interest

int getRateOfInterest(){return 0;}  

}  

//Creating child classes.  

class SBI extends Bank{  

//create function to calculate interest for SBI

int getRateOfInterest(){return 8;}  

}  

class ICICI extends Bank{  

//create function to calculate interest for ICICI

int getRateOfInterest(){return 7;}  

}  

class AXIS extends Bank{  

//create function to calculate interest for AXIS

int getRateOfInterest(){return 9;}  

}  

