import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sport");
		String sport = in.nextLine();
		System.out.println("Enter a boy's name");
		String boysName = in.nextLine();
		System.out.println("Enter a number betwenn 1 and 5");
		int score = in.nextInt();
		System.out.println("Enter a celebration");
		String celebration = in.nextLine();
		
		
		
		
		
		//STORY
		System.out.println("One day during a "+sport+" game, "+boysName+" scored a touchdown. Everybody was "+celebration+" him");

	}

}
