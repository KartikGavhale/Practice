package string;

public class CheckOccurance
{
	public static void main(String[] args)
	{
		String s = "Hello , World";
		
		
		char a= 'o';
		char b = ',';
		
		for(int i = 0 ; i<s.length(); i++ )
		{
			if(s.charAt(i)== a)
			{
				System.out.println("1st occurance of char "+ a+ " is at index "+ i);continue;
			}
			if(s.charAt(i)== b)
			{
				System.out.println("1st occucrance of char "+ b + " is at index "+ i);break;
			}
		}
		for (int i = s.length()-1; i>=0 ; i--)
		{
			if(s.charAt(i)== a)
			{
				System.out.println("Last occurance of char "+ a+ " is at index "+ i);continue;
			}
			if(s.charAt(i)== b)
			{
				System.out.println("Last occucrance of char "+ b + " is at index "+ i);break;
			}
		}
	}
}
		
	

