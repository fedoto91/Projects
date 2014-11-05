package findE;

/**
 * 
 * @author Eugene Fedotov
 *
 * Find e to the Nth Digit - Just like the previous problem, 
 * but with e instead of PI. Enter a number and have the 
 * program generate e up to that many decimal places. 
 * Keep a limit to how far the program will go.
 */


public class Main {

	static final String E = "2.71828182845904523536028747135266249775724709369995";
	
	public static void main(String[] args)
	{
		int nthDigit = Integer.parseInt(args[0]);
		
		String result = "";
		
		if (nthDigit == 0)
		{
			result = "2";
		}
		else if (nthDigit > 50)
		{
			result = "> 50 not allowed.";
		}
		else
		{
			result += "2.";
			
			for (int i = 0; i < nthDigit; i++)
			{
				result += E.charAt(i + 2);
			}
		}

		System.out.println(result);
	}
}
