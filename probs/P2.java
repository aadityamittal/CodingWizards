package probs;

import java.util.Scanner;

public class P2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int disNorth = 0,disEast = 0;
		for(int i = 1; i<=4; i++)
		{
			System.out.print("Enter the position where the man moves first: ");
			String pos = sc.next().toLowerCase();
			if(pos.equals("north"))
				disNorth++;
			if(pos.equals("south"))
				disNorth--;
			if(pos.equals("east"))
				disEast++;
			if(pos.equals("west"))
				disEast--;
		}int m = (Math.abs(disNorth)+Math.abs(disEast));
		if(m!=0)
			System.out.println("Output: "+(Math.abs(disNorth)+Math.abs(disEast)));
		else
			System.out.println("Travelling wasted");
	}

}
