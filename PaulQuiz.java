import java.util.Scanner;
/**
* True and False quiz
*
* @author Paul Reid
* @version 8/6/18
*/

public class PaulQuiz
{
	private int myScore;
	private static String myName;
	private String[][] myStatements;
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		Scanner user_input = new Scanner(System.in);
		myName = user_input.next( );
		PaulQuiz quiz = new PaulQuiz(myName);
		quiz.play();
	}
	public PaulQuiz(String name)
	{
		myScore = 0;
		myName = name;
		myStatements = new String[2][10];
		myStatements[0][0] = "Paul was born in Australia";
		myStatements[1][0] = "T";
		myStatements[0][1] = "Paul has a loft bed";
		myStatements[1][1] = "T";
		myStatements[0][2] = "Paul has 1 sister";
		myStatements[1][2] = "F";
		myStatements[0][3] = "Paul is homeschooled";
		myStatements[1][3] = "T";
		myStatements[0][4] = "Paul has been to 3 countries";
		myStatements[1][4] = "F";
		myStatements[0][5] = "Paul has only coded in Scratch, Bitsbox, Lego WeDo, Lego Mindstorms, and Code.org";
		myStatements[1][5] = "T";
		myStatements[0][6] = "Paul LOVES Fortnight";
		myStatements[1][6] = "F";
		myStatements[0][7] = "Paul has been to all 50 states";
		myStatements[1][7] = "F";
		myStatements[0][8] = "Paul swims";
		myStatements[1][8] = "T";
		myStatements[0][9] = "Paul always gets blue ribbons in swimming";
		myStatements[1][9] = "F";
	}
	public void play()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the quiz! ");
		System.out.println("Enter T for true and F for false after each statement");
		for(int col = 0; col < myStatements[0].length; col++)
		{
			System.out.println(myStatements[0][col]);
			System.out.println("T or F?");
			String answer = keyboard.next();
			if(answer.equals(myStatements[1][col]))
			{
				System.out.println("Correct");
				myScore++;
				System.out.println("Score: " + myScore);
			}
			else
			{
				System.out.println("Sorry, you were wrong.");
				System.out.println("Score: " + myScore);
			}
		}
		System.out.println("Final Score: " + myScore);
		System.out.println(myName + ", thanks for playing!");
	}
}
