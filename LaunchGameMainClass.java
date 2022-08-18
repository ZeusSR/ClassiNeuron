package guesserGame;

import java.util.Scanner;

public class LaunchGameMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UmpireClass umpire = new UmpireClass();
		umpire.umpiredecisionmethod();

	}



}
class GuesserClass
{
	
	int numGuesser;
	Scanner sc=new Scanner(System.in);
	
	public int guessnumbermethod() 
	{
	System.out.println("Hello Guesser please Enter the number");
	return numGuesser=sc.nextInt();
	
	
	}
}


class PlayerClass 
{
	int[] numPlayer = new int[3];
	Scanner sc=new Scanner(System.in);
		
	public int[] playerguessnumbermethod()
	{
	for (int i=0;i<numPlayer.length;i++)
	{	
		System.out.println("Player"+" "+i+" "+"Kindly guess the number");
		 numPlayer[i]=sc.nextInt();
		
	}
	return numPlayer;
	}
	
}

class UmpireClass
{
	GuesserClass guesser= new GuesserClass();
	PlayerClass player= new PlayerClass();
	
	int guessernum=guesser.guessnumbermethod();
	int[] playernum=player.playerguessnumbermethod();
	
	public void umpiredecisionmethod()
	{
		if(guessernum==playernum[0])
		{
			if(guessernum==playernum[0] && guessernum==playernum[1])
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(guessernum==playernum[1])
			{
				System.out.println("Player 0 and Player 1 won the game");
			}
			else if(guessernum==playernum[2])
			{
				System.out.println("Player 0 and Player 2 won ");
			}
			else
			{
			
			System.out.println("Player 0 won the game");
			}
		}
		
		
		else if(guessernum==playernum[1])
		{
			
			if(guessernum==playernum[2])
			{
			System.out.println("Player 1 and Player 2 won the game");
			}
			else
			{
				System.out.println("Player 1 won the game");
			}
		}
		
		
		
		else if(guessernum==playernum[2])
		{
			System.out.println("Player 2 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
		
	}
	
}
