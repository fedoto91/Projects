package findPi;

/**
 * 
 * @author Eugene Fedotov
 *
 * Find PI to the Nth Digit - Enter a number and have 
 * the program generate PI up to that many decimal places. 
 * Keep a limit to how far the program will go.
 */


public class Main {

	public static void main(String[] args)
	{
		int nthDigit = Integer.parseInt(args[0]);
		
		final String PI = "3.14159265358979323846264338327950288419";
		String result = "";
		
		if (nthDigit == 0)
		{
			result = "3";
		}
		else if (nthDigit > 38)
		{
			result = "> 38 not allowed.";
		}
		else
		{
			result += "3.";
			
			for (int i = 0; i < nthDigit; i++)
			{
				result += PI.charAt(i + 2);
			}
		}

		System.out.println(result);
	}
}
