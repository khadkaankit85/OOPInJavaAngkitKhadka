public class Main {   
  public static void main(String[] args) 
  {       
    Clicker entranceA = new Clicker();       
    Clicker entranceB = new Clicker();
    entranceA.click();       
    entranceA.click();       
    entranceB.click();       
    entranceB.click();       
    entranceB.click();
    entranceB.click();
    System.out.println("People at entrance A: "+entranceA.getValue());    
    System.out.println("People at entrance B: "+entranceB.getValue());      
    entranceA.reset();        
    entranceB.reset();       
    System.out.println("People at entrance A: "+entranceA.getValue());     
    System.out.println("People at entrance B: "+entranceB.getValue());   }}

public class Clicker {
  private int value;
  public void click()
          {         value+=1;   }
  public void reset()
         {       value=0;   }
  public int getValue()
         {        return value;   }}