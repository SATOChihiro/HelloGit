import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){

	System.out.println("What is your name?");
	System.out.print("> ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	System.out.println("Hello, " + name + "!");
	
	System.out.println("Rolling dice...");
	Random ran1 = new Random();
	Random ran2 = new Random();
	int d1 = ran1.nextInt(5)+1;
	int d2 = ran2.nextInt(5)+1;
	int sum = d1 + d2;
	System.out.println("Die 1: " + d1);
	System.out.println("Die 2: " + d2);
	System.out.println("Total value: " + sum);
	
    }
}
