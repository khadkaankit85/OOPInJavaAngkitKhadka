// Create a Main class
public class Car {

  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car volvo = new Car();   // Create a myCar Volvo object
    volvo.fullThrottle();      // Call the fullThrottle() method
    volvo.speed(150);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200