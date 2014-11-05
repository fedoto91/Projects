package fibonacci;

/**
 * 
 * @author Eugene Fedotov
 *
 * Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence 
 * to that number or to the Nth number.
 */

class Main {
	
	final int SEED1 = 0;
	final int SEED2 = 1;
	
	public static void main(String[] args)
	{
		System.out.println(fibonacci(Integer.parseInt(args[0])));
	}
	
	public static int fibonacci(int n)  {
	   if (n==0)
		   return 0;
	   else if(n==1)
		   return 1;
	   else
		   return fibonacci(n-1) + fibonacci(n-2);
	}

}
