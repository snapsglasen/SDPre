import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = kb.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = kb.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = kb.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
    double dub1 = kb.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double dub2 = kb.nextDouble();

    System.out.println("Please ender the third decimal number you would like to add.");
    double dub3 = kb.nextDouble();

    int sum = num1 + num2 + num3;
    double sum1 = dub1 + dub2 + dub3;

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sum1);


  }
}
