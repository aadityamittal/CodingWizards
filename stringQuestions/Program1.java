package stringQuestions;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char m = 'P';
		String s1 = "";
		for(int i = 0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!='G'&&s.charAt(i)!='C'&&s.charAt(i)!='T'&&s.charAt(i)!='A')
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else
			{
				if(s.charAt(i) == 'G')
					m = 'C';
				if(s.charAt(i) == 'C')
					m = 'G';
				if(s.charAt(i) == 'T')
					m = 'A';
				if(s.charAt(i) == 'A')
					m = 'U';
				s1 = s1+m;
			}
		}
		System.out.println(s1);
	}

}
