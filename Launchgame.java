import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;	
		
	}	

}

class Player
{
	int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pguessNum=scan.nextInt();
		return pguessNum;
	}
}

class Umpire
{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare(int attempt,boolean win)
	{
		collectNumFromGuesser();
	    while(win==false && attempt<=5)
	    {
			collectNumFromPlayer();
		if(numFromGuesser==numFromPlayer1)
		{
			win=true;
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
				System.out.println("You used "+attempt+" turns to guess the right number");
				break;
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 won the game");
				System.out.println("You used "+attempt+" turns to guess the right number");
				break;
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 won ");
				System.out.println("You used "+attempt+" turns to guess the right number");
				break;
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			System.out.println("You used "+attempt+" turns to guess the right number");
			break;
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			win=true;
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			System.out.println("You used "+attempt+" turns to guess the right number");
			break;
			}
			else
			{
				System.out.println("Player 2 won the game");
				System.out.println("You used "+attempt+" turns to guess the right number");
				break;
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			win=true;
			System.out.println("Player 3 won the game");
			System.out.println("You used "+attempt+" turns to guess the right number");
			break;
		}
		else if(win==false)
		{
			System.out.println("Game lost! try again");
			System.out.println("You used "+attempt+" turns!" + " Remaining " + (5-attempt)  + " turns!");
		}
		else if(attempt == 5) {
            System.out.println("You have exceeded the maximum attempt. Try Again");
            break;
        }
		attempt++;
	}
	}
	
}





public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Guess Number Game \nYou have Maximum 5 Attempt Limit");
		int attempt = 1;
		boolean win=false;
		Umpire u=new Umpire();
		u.compare(attempt,win);

	}

}
