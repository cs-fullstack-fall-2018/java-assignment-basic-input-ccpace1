import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args)

    {   //Exercise 1
        System.out.println("It's a great day today.");
        System.out.println("What is your name, user? ");
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.nextLine();
        System.out.println("Hello " + name1);

        //Excersice 2
        System.out.println("Please imput your first number: ");
        Scanner scan2 = new Scanner(System.in);
        int number1 = scan2.nextInt();
        System.out.println("Please imput your second number: ");
        Scanner scan3 = new Scanner(System.in);
        int number2 = scan3.nextInt();
        System.out.println(number1 + " and " + number2 + " are your two numbers.");
        int number3 = number1 + number2;
        System.out.println("The sum of the two number are " + number3);
        int number4 = number1 - number2;
        System.out.println("The difference of the two number are " + number4);

        //Exercise 3
        System.out.println("Please enter your balance, " + name1 + ".");
        Scanner scan4 = new Scanner(System.in);
        double balance1 = scan4.nextDouble();
        System.out.println("You're current balance is " + balance1 + ".");

        System.out.println("I've been generous to you and granted you an extra $1.50!");
        System.out.println("You're new balance is " + (balance1+1.5) + "!");

    }
}
//Ask the user to enter their balance. Print “I’ve granted you $1.50 more!. Your new balance is: [BALANCE]”
