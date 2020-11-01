package stringQuestions;

import java.util.Random;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		char[] m = {'R','P','S'};
		int userScore = 0,computerScore = 0;
		
		for(int i = 0; i<=2;i++) {
			System.out.println("Enter User's Choice: ");
			char m1 = sc.next().charAt(0);
			if(m1!='R' && m1!='P'&& m1!='S') {
				System.out.println("Enter correct choice stupid");
				System.exit(0);
			}
			else {
				System.out.println("Computer's Chioice(Randomly generated)");
				char comp = m[random.nextInt(3)];
				System.out.println(comp);
				switch(m1)
				{
				case 'R':
					if(comp == 'P')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					else if(comp == 'R')
					{
						System.out.println("Tie of round");
					}
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					
				break;
				
				case 'P':
					if(comp == 'S')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					else if(comp == 'P')
					{
						System.out.println("Tie of round");
					}
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					break;
				case 'S':
					if(comp == 'R')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					else if(comp == 'S')
					{
						System.out.println("Tie of round");
					}
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					break;
				}
			}}
		if(userScore == computerScore)
		{
			System.out.println("3 rounds over, User Scored "+userScore+",Tie of Game");
		}
		else if(userScore > computerScore)
		System.out.println("3 rounds over, User Scored "+userScore+",User won the game");
		else {
			System.out.println("3 rounds over, User Scored "+userScore+",Computer won the game");
		}
	}

}
