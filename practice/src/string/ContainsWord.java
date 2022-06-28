package string;

public class ContainsWord
{
	public static void main(String[] args)
	{
		String s = "This is orange juice";
		String[] S = s.split(" ");
		for (int i= 0 ; i<S.length ; i++)
		{
			if(S[i].equalsIgnoreCase("Orange"))
			{
				System.out.println("String contains word 'orange' at index of : "+ i);
			}
		}
	}
}
