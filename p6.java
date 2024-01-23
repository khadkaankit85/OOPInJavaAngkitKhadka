
public class TestArray {
  public static void main(String[] args) {
    double[] myList = { 1.9, 2.9, 3.4, 3.5, 15.0, 1.3, 6.3, 7.8, 9.2, 10.5 };
    // Print all the array elements
    for (int i = 0; i < myList.length; i++) {
      System.out.println(i + " " + myList[i]);
    }
    System.out.println(myList.length);
    // Summing all elements
    double total = 0;
    for (int i = 0; i < myList.length; i++) {
      total += myList[i];
    }
    System.out.println("Total is " + total + " Average=" + total / myList.length);

    // Finding the largest element
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max)
        max = myList[i];
    }
    System.out.println("Max is " + max);
  }
}