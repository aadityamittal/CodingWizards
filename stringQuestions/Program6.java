package stringQuestions;

public class Program6 {

	public static void main(String[] args) {
		int np=1;
		int n=1;
		while(np<=10001)
		{
			n+=2;
			if(isPrime(n))
				np++;
		}
		System.out.println(n);
	}
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		else {
			int c=3;
			while(c*c<=n)
			{
				if(n%c==0)
					return false;
				c+=2;
			}
			return true;
		}
	}
}