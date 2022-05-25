import java.util.Scanner;
public class Objective4Lab3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int currentYear = 2020;

    System.out.println("How old are you?");
    int age = input.nextInt();

    int birthYear = currentYear - age;

  System.out.println("You were born in " + birthYear);


  }
}
