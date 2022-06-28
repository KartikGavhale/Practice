package string;

public class StringContainsLetter 
{
	public static void main(String[] args)
	{
		String u = "Umbrella";
		
		char[] c = u.toCharArray();
		int n = c.length;
		for (int i = 0 ; i< n ; i++)
		{
			if(c[i] == 'e')
			{
				System.out.println("Yes String contains leter 'E' at index :" +i);
				break;
			}
		}
	}

}
