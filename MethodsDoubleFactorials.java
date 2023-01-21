
public class MethodsDoubleFactorials {
	public static void main(String[] args) {
		for (int i=0; i <= 9 ;i++) {
			System.out.println( i + "!! = " + doubleFactorial(i) );
		}
		
		
	
	}
	
	private static int doubleFactorial(int n)
    {
        int res = 1;
        for (int i = n; i >= 0; i = i-2)
        {
            if (i == 0 || i == 1)
                return res;
            else
                res *= i;
        }
         
        return res;
    }}


