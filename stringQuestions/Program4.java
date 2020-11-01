package stringQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Program4  
{ 
	static int days [] = { 31, 28, 31, 30, 31, 30, 
						31, 31, 30, 31, 30, 31 }; 
	static int splitting(String s)
	{
		String s1[] = s.split(" ");
		String day = s1[0];
		String month = "";
//		System.out.println(Arrays.toString(s1));
		if(s1[2].equals("January"))
			month = "1";
		else if(s1[2].equals("February"))
			month = "2";
		else if(s1[2].equals("March"))
			month = "3";
		else if(s1[2].equals("April"))
			month = "4";
		else if(s1[2].equals("May"))
			month = "5";
		else if(s1[2].equals("June"))
			month = "6";
		else if(s1[2].equals("July"))
			month = "7";
		else if(s1[2].equals("August"))
			month = "8";
		else if(s1[2].equals("September"))
			month = "9";
		else if(s1[2].equals("October"))
			month = "10";
		else if(s1[2].equals("November"))
			month = "11";
		else if(s1[2].equals("December"))
			month = "12";
		else {
			System.out.println("Invalid format/choice of month");
			System.exit(0);
		}
		String y = s1[3];
		return dayOfYear(day,month,y);
	}
	static int dayOfYear(String day1,String month1,String year1) 
	{ 
		int year = Integer.parseInt(year1); 
		
		int month = Integer.parseInt(month1); 
		
		int day = Integer.parseInt(day1);
		if ( year % 4 == 0 && 
		(year % 100 != 0 || year % 400 == 0)) 
		{ 
			days[1] = 29; 
		} 
		while (--month > 0) 
		{ 
			day = day + days[month - 1]; 
		} 
		return day; 
	} 
	
	public static void main (String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in format like (21 st December 2020)");
		String date = sc.nextLine();
		System.out.println(splitting(date)); 
	} 
} 
