import java.util.Scanner; // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    int x, y, sum;
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input
    }
    sum = x + y;  // Calculate the sum of x + y
    System.out.println("Sum is: " + sum); // Print the sum
  }
} 